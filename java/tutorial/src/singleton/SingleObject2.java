package singleton;

public class SingleObject2 {
    public static final SingleObject2 INSTANCE = new SingleObject2();
    private SingleObject2(){}
    public void showMessage() {
        System.out.println("Hello world!");
    }
}
