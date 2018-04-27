package chainofresponsibility;

/**
 * @author zacconding
 * @Date : 2018-01-05
 * @GitHub : https://github.com/zacscoding
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("## File:Logger: " + message);
    }
}
