package decorator;

import java.util.logging.Logger;

public class SimpleTroll implements Troll {
    private  final static  Logger LOGGER = Logger.getLogger(SimpleTroll.class.getName());
    @Override
    public void attack() {
        LOGGER.info("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }
    @Override
    public void fleeBattle() {
        LOGGER.info("The troll shrieks in horror and runs away!");

    }
}
