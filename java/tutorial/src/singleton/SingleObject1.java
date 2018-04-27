package singleton;

public class SingleObject1 {
    private static SingleObject1 instance = new SingleObject1();
    private SingleObject1() {
        // empty
    }
    public static SingleObject1 getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Hello World");
    }    
}
