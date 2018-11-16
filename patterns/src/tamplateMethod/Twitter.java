package tamplateMethod;

public class Twitter extends NetWork {
    public Twitter(String userName, String password) {
        this.password = password;
        this.userName = userName;
    }


    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name" + this.userName);
        System.out.println("password");

        for (int i = 0; i < this.password.length(); i++) {
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Twitter");
        return true;
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePost = true;
        if (messagePost) {
            System.out.println("Message" + new String(data) + " was posted on Twitter");
            return true;
        } else {
            return false;
        }
    }

    @Override
    void logout() {
        System.out.println("User" + userName + " was logout from Twitter");
    }
}
