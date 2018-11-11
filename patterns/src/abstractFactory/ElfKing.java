package abstractFactory;

public class ElfKing implements King {
    static final String DESCRIPTION = "This is Elf's King";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
