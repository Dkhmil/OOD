package bridge;


import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("The knight receives an enchanted sword.");
        Sword sword = new Sword(new SoulEatingEnchantment());
        sword.swing();
        sword.unwield();
        sword.wield();

        LOGGER.info("The valkyrie receives an enchanted hammer.");
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.swing();
        hammer.unwield();
        hammer.wield();

    }
}
