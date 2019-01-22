package template;

/**
 * https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
