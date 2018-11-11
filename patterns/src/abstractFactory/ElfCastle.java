package abstractFactory;

public class ElfCastle implements Castle {
    static final String DESCRIPTION = "This Elf's Castle";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
