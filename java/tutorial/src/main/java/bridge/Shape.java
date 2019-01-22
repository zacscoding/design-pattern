package bridge;

/**
 * abstract class Shape using DrawAPI interface
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    
    public abstract void draw();
}
