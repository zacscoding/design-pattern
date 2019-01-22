package bridge;

/**
 * concrete class implementing the Shape interface
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public class Circle extends Shape {
    private int x, y, radius;
    
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }    
}
