package abstractFactory;

public class OrcCastle implements Castle {
    static final String DESCRIPTION = "This is orc;s Castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
