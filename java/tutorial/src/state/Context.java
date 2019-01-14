package state;

/**
 * https://www.tutorialspoint.com/design_pattern/state_pattern.htm
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
