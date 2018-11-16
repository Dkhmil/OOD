package chainOfResponsibility;

public abstract class MiddleWare {
    private MiddleWare next;

    public MiddleWare linkWith(MiddleWare next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }

}
