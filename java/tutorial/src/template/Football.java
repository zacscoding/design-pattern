package template;

/**
 * https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Football start");
    }

    @Override
    void endPlay() {
        System.out.println("Football end");
    }
}
