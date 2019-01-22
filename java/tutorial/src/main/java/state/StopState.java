package state;

/**
 * https://www.tutorialspoint.com/design_pattern/state_pattern.htm
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
