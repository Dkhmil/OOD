package tamplateMethod;

public abstract class NetWork {
    protected String userName;
    protected String password;

    public NetWork() {
    }

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logout();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logout();
}
