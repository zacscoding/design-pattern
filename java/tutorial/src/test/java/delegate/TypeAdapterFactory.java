package delegate;

import java.lang.reflect.Type;

/**
 * testing from gson
 */
public interface TypeAdapterFactory {

    <T> TypeAdapter<T> create(TypeClient client, Type type);
}
