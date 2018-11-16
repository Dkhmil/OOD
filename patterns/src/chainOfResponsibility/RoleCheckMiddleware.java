package chainOfResponsibility;

public class RoleCheckMiddleware extends MiddleWare {
    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@example.com")) {
            System.out.println("Hello Admin");
            return true;
        }
        System.out.println("Hello user");
        return checkNext(email,password);
    }
}
