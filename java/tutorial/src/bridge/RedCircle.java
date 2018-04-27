package bridge;

/**
 * concrete bridge implementer classes implementing DrawAPI
 * 
 * @author zaccoding
 * @date 2017. 8. 28.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color : red, radius : " + radius + ", x : " + x + ", y : " + y + " ]");
    }
}
