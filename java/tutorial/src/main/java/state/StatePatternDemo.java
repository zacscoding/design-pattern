package state;

/**
 * https://www.tutorialspoint.com/design_pattern/state_pattern.htm
 */
public abstract class StatePatternDemo implements State {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

        // Output
//        Player is in start state..
//        Start State
//        Player is in stop state
//        Stop State
    }
}
