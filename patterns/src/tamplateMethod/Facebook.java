package tamplateMethod;

public class Facebook extends NetWork {
    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\\nChecking user's parameters");
        System.out.println("Name" + this.userName);
        System.out.println("password");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePost = true;
        if (messagePost) {
            System.out.println("Message" + new String(data) + " was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }

    @Override
    void logout() {
        System.out.println("User:" + userName + "was logout from Facebook");

    }

    public void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.println(".");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

