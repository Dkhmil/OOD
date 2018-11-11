package abstractFactory;

public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is Elf army";

    @Override
    public String getDescription() {

        return DESCRIPTION;
    }
}
