package factoryPattern;

public class MobileFactory {
    public static Mobile createMobile(String type) {
        if (type.equals(Mobile.IPONE)) {
            return new Iphone(2, "A9", "A9 Gpu");
        }
        if (type.equals(Mobile.SAMSUNG)) {
            return new Sumsung("Intel");
        }
        if (type.equals(Mobile.SONY)) {
            return new Sony(2, "ARM");
        } else {
            return null;
        }
    }
}
