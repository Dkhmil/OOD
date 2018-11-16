package bridge;

import java.util.logging.Logger;

public class Sword implements Weapon {

    private static final Logger LOGGER = Logger.getLogger(Sword.class.getName());

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    private final Enchantment enchantment;

    @Override
    public void wield() {
        LOGGER.info("The sword is wielded.");
        enchantment.onActive();
    }

    @Override
    public void swing() {
        LOGGER.info("The sword is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("The sword is unwielded.");
        enchantment.onDeactive();
    }


    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
