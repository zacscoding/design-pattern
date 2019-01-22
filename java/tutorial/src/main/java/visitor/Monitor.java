package visitor;

/**
 * concrete class extending ComputerPart
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
