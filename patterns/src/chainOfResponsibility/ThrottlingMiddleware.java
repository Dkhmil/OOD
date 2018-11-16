package chainOfResponsibility;

public class ThrottlingMiddleware extends MiddleWare {

    private int requesrtPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requesrtPerMinute) {
        this.requesrtPerMinute = requesrtPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        if(System.currentTimeMillis() < currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if(request > requesrtPerMinute) {
            System.out.println("Request limit exceed");
            Thread.currentThread().stop();

        }
        return checkNext(email,password);
    }
}
