package bridge;

import java.util.logging.Logger;

public class FlyingEnchantment implements Enchantment {

    private final static Logger LOGGER = Logger.getLogger(FlyingEnchantment.class.getName());
    @Override
    public void onActive() {
     LOGGER.info("The item begins to glow faintly.");
    }

    @Override
    public void apply() {
        LOGGER.info("The item flies and strikes the enemies finally returning to owner's hand.");

    }

    @Override
    public void onDeactive() {
        LOGGER.info("The item's glow fades");

    }
}
