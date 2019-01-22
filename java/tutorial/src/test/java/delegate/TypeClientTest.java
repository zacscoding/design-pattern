package delegate;

import org.junit.Test;

/**
 * testing from gson
 */
public class TypeClientTest {

    @Test
    public void testDelegate() {
        TypeClient client = new TypeClient();
        String[] array = {"a", "b", "c"};

        TypeAdapter<String[]> adapter = client.getAdapter(array.getClass());
        TypeAdapter<String[]> adapter2 = client.getAdapter(array.getClass());
        TypeAdapter<String[]> adapter3 = client.getAdapter(array.getClass());

        System.out.printf("Adapter :: %s / Display : %s\n", adapter.toString(), adapter.display(array));
        System.out.printf("Adapter :: %s / Display : %s\n", adapter2.toString(), adapter2.display(array));
        System.out.printf("Adapter :: %s / Display : %s\n", adapter3.toString(), adapter3.display(array));
    }


}
