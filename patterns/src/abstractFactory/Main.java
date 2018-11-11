package abstractFactory;


import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    private King king;
    private Castle castle;
    private Army army;

    public King getKing() {
        return king;
    }


    public void setKing(King king) {
        this.king = king;
    }

    public Castle getCastle() {
        return castle;
    }


    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public Army getArmy() {
        return army;
    }


    public void setArmy(Army army) {
        this.army = army;
    }

    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setArmy(factory.createArmy());
        setCastle(factory.createCastle());

    }

    public static void main(String[] args) {
        Main main = new Main();
        LOGGER.info("Elf Kingdom");
        main.createKingdom(new ElfKingdomFactory());
        LOGGER.info(main.getArmy().getDescription());
        LOGGER.info(main.getCastle().getDescription());
        LOGGER.info(main.getKing().getDescription());

        LOGGER.info("Orc Kingdom");
        main.createKingdom(new OrcKingdomFactory());
        LOGGER.info(main.getArmy().getDescription());
        LOGGER.info(main.getCastle().getDescription());
        LOGGER.info(main.getKing().getDescription());

    }
}
