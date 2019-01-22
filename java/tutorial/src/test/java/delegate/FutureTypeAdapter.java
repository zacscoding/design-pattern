package delegate;

/**
 * testing from gson
 */
public class FutureTypeAdapter<T> extends TypeAdapter<T> {

    private TypeAdapter<T> delegate;

    public void setDelegate(TypeAdapter<T> typeAdapter) {
        if (typeAdapter == null) {
            throw new NullPointerException("typeAdapter == null");
        }

        this.delegate = typeAdapter;
    }

    @Override
    public String display(T value) {
        if (delegate == null) {
            throw new IllegalStateException();
        }

        return delegate.display(value);
    }
}
