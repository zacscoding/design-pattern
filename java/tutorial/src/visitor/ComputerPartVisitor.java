package visitor;

/**
 * interface to represent visitor
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse computer);
    public void visit(Keyboard computer);
    public void visit(Monitor computer);
}
