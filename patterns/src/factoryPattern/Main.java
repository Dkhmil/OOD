package factoryPattern;

public class Main {

    public static void main(String[] args) {
        Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
        System.out.println(mobile.toString());
    }
}
