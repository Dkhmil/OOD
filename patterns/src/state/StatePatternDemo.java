package state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState state = new StartState();
        state.doAction(context);
        System.out.println(context.getState().toString());

        StopState state1 = new StopState();
        state1.doAction(context);
        System.out.println(context.getState().toString());
    }
}
