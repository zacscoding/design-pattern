package delegate;

/**
 * testing from gson
 */
public class TypeAdapter<T> {

    public String display(T value) {
        return "Display type ... : " + (value == null ? "null" : value.getClass().getSimpleName());
    }
}
