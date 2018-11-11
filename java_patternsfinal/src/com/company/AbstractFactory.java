package com.company;

public abstract class AbstractFactory {
    public abstract Mage createMage();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
 interface Mage {
    public void cast();
}
 interface Archer {
    public void shoot();
}
 interface Warrior {
    public void attack();
}
class ElfSquadronFactory extends AbstractFactory {
    public Mage createMage() {
        return new ElfMage();
    }
    public Archer createArcher() {
        return new ElfArcher();
    }
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
 class ElfMage implements Mage {
    public void cast() {
    }
}
 class ElfArcher implements Archer {
    public void shoot() {
    }
}
 class ElfWarrior implements Warrior {
    public void attack() {
    }
}
class main{
    public void createSquadron (AbstractFactory factory){
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
    }
}

