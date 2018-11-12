package adapter;

public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan(new FishingBoatAdapter());
        capitan.row();
    }
}
