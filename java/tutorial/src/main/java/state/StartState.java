package state;

/**
 * https://www.tutorialspoint.com/design_pattern/state_pattern.htm
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state..");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
