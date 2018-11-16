package state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop place");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
