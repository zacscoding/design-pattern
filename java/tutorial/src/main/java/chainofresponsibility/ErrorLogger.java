package chainofresponsibility;

/**
 * @author zacconding
 * @Date : 2018-01-05
 * @GitHub : https://github.com/zacscoding
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("## Error Console :: Logger: " + message);
    }
}
