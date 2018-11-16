package bridge;

import java.util.logging.Logger;

public class Hammer implements Weapon {

    private final static Logger LOGGER = Logger.getLogger(Hammer.class.getName());
    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        LOGGER.info("he hammer is wielded.");
        enchantment.onActive();
    }

    @Override
    public void swing() {
        LOGGER.info("The hammer is swinged.");
        enchantment.apply();

    }

    @Override
    public void unwield() {
        LOGGER.info("The hammer is unwielded");
        enchantment.onDeactive();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
