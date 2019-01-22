package visitor;

/**
 * concrete visitor implementing ComputerPartVisitor
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse computer) {
        System.out.println("Displaying Mouse.");        
    }

    @Override
    public void visit(Keyboard computer) {
        System.out.println("Displaying Keyboard.");        
    }

    @Override
    public void visit(Monitor computer) {
        System.out.println("Displaying Monitor.");        
    }
    

}
