package decorator;

import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("a simple loking troll approaches");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        troll.getAttackPower();

        LOGGER.info("A troll with huge club surprises you.");
        Troll troll1 = new ClubbedTroll(troll);
        troll1.attack();
        troll1.fleeBattle();
        troll1.getAttackPower();

    }
}
