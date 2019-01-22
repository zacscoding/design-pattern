package delegate.bind;

import delegate.TypeAdapter;
import delegate.TypeAdapterFactory;
import delegate.TypeClient;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/**
 * testing from gson
 */
public class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        @Override
        public <T> TypeAdapter<T> create(TypeClient client, Type type) {
            if (!(type instanceof GenericArrayType || type instanceof Class && ((Class<?>) type).isArray())) {
                return null;
            }

            return new ArrayTypeAdapter();
        }
    };

    @Override
    public String display(Object value) {
        return "Display type ... : ArrayTypeAdapter";
    }
}
