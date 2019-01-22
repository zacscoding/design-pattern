package delegate.bind;

import delegate.TypeAdapter;
import delegate.TypeAdapterFactory;
import delegate.TypeClient;
import java.lang.reflect.Type;

/**
 * @author zacconding
 * @Date 2019-01-23
 * @GitHub : https://github.com/zacscoding
 */
public class ObjectTypeAdapter extends TypeAdapter<Object> {

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        @Override
        public <T> TypeAdapter<T> create(TypeClient client, Type type) {
            if (type == Object.class) {
                return (TypeAdapter<T>) new ObjectTypeAdapter();
            }

            return null;
        }
    };
}
