package tamplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoPatternTamplateMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NetWork netWork = null;
        System.out.println("input userNAme");
        String userName = reader.readLine();
        System.out.println("input password");
        String password = reader.readLine();
        System.out.println("print message");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            netWork = new Facebook(userName, password);
        } else if (choice == 2) {
            netWork = new Twitter(userName, password);
        }
        netWork.post(message);
    }
}
