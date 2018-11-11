package singleton;

public class Satellite {
    private static Satellite instance;

    private Satellite() {

    }

    private static class SatelliteHelper {
        private static final Satellite innerInstance = new Satellite();

    }
    public static Satellite getSatellite() {
        return SatelliteHelper.innerInstance;
    }

    public static Satellite getLazySatellite() {
        if(instance == null) {
            instance = new Satellite();
        }
        return instance;
    }

}
