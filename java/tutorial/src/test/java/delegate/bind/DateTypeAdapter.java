package delegate.bind;

import delegate.TypeAdapter;
import delegate.TypeAdapterFactory;
import delegate.TypeClient;
import java.lang.reflect.Type;
import java.util.Date;

/**
 * @author zacconding
 * @Date 2019-01-23
 * @GitHub : https://github.com/zacscoding
 */
public class DateTypeAdapter extends TypeAdapter<Date> {

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        @Override
        public <T> TypeAdapter<T> create(TypeClient client, Type type) {
            if (type == Date.class) {
                return (TypeAdapter<T>) new DateTypeAdapter();
            }

            return null;
        }
    };

    @Override
    public String display(Date value) {
        return "Display type ... : Date";
    }
}
