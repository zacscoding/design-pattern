package delegate;

import delegate.bind.ArrayTypeAdapter;
import delegate.bind.DateTypeAdapter;
import delegate.bind.ObjectTypeAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * testing from gson
 */
public class TypeClient {

    private Map<Type, TypeAdapter<?>> cache = new ConcurrentHashMap<>();
    private ThreadLocal<Map<Type, FutureTypeAdapter<?>>> calls = new ThreadLocal<>();
    private List<TypeAdapterFactory> factories;

    public TypeClient() {
        factories = new ArrayList<>();
        factories.add(ArrayTypeAdapter.FACTORY);
        factories.add(DateTypeAdapter.FACTORY);
        factories.add(ObjectTypeAdapter.FACTORY);
    }

    public <T> TypeAdapter<T> getAdapter(Type type) {
        Objects.requireNonNull(type, "Type must be not null");

        TypeAdapter<?> cached = cache.get(type);
        if (cached != null) {
            System.out.println("Will use cache about " + type.getTypeName());
            return (TypeAdapter<T>) cached;
        }

        Map<Type, FutureTypeAdapter<?>> threadCalls = calls.get();
        boolean needCleanUp = false;
        if (threadCalls == null) {
            threadCalls = new HashMap<>();
            calls.set(threadCalls);
            needCleanUp = true;
        }

        FutureTypeAdapter<?> ongoingCall = threadCalls.get(type);
        if (ongoingCall != null) {
            System.out.println("Used ongoingCall");
            return (TypeAdapter<T>) ongoingCall;
        }

        try {
            FutureTypeAdapter<T> call = new FutureTypeAdapter<>();
            System.out.println("Will use FutureTypeAdapter");
            threadCalls.put(type, call);

            for (TypeAdapterFactory factory : factories) {
                TypeAdapter<T> candidate = factory.create(this, type);
                if (candidate != null) {
                    call.setDelegate(candidate);
                    cache.put(type, candidate);
                    return candidate;
                }

                /*try {
                    TimeUnit.SECONDS.sleep(1L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }*/
            }

            throw new IllegalArgumentException("Cannot handle " + type.getTypeName());
        } finally {
            threadCalls.remove(type);

            if (needCleanUp) {
                calls.remove();
            }
        }

    }
}
