package adapter;

public class Capitan {
    public void setBoat(RowingBoat boat) {
        this.boat = boat;
    }

    private RowingBoat boat;

    public Capitan() {
    }

    public Capitan(RowingBoat boat) {
        this.boat = boat;
    }
    public void row() {
        boat.row();
    }
}

