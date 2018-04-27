package visitor;

/**
 * interface to represent elt
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
