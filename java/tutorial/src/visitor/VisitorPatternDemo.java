package visitor;

/**
 * Visitor Pattern demo runner
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
