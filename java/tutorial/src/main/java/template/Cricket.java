package template;

/**
 * @author zacconding
 * @Date 2018-07-18
 * @GitHub : https://github.com/zacscoding
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricket initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket start");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket end");
    }
}
