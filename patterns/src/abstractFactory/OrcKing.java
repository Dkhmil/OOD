package abstractFactory;

public class OrcKing implements King {
    static final String DESCRIPTION = "This is orc King";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
