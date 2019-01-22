package visitor;

/**
 * concrete class extending ComputerPart
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;
    
    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }
        
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
