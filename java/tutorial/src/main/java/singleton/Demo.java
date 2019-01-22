package singleton;

public class Demo {
    public static void main(String[] args) {
        // SingleObject1 inst11 = new SingleObject1(); // compile error
        SingleObject1 inst11 = SingleObject1.getInstance();
        inst11.showMessage();
        SingleObject1 inst12 = SingleObject1.getInstance();
        System.out.println(inst11 == inst12);
        
        SingleObject2 inst21 = SingleObject2.INSTANCE;
        inst21.showMessage();
        
        SingleObject2 inst22 = SingleObject2.INSTANCE;
        System.out.println(inst21 == inst22);
    }

}
