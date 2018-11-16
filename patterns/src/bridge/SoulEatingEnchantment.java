package bridge;

import java.util.logging.Logger;

public class SoulEatingEnchantment implements Enchantment {
    private final static Logger LOGGER = Logger.getLogger(SoulEatingEnchantment.class.getName());
    @Override
    public void onActive() {
        LOGGER.info("The item spreads bloodlust");

    }

    @Override
    public void apply() {
      LOGGER.info("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactive() {
    LOGGER.info("Bloodlust slowly disappears.");
    }
}
