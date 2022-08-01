package day11.task2;

public abstract class Hero implements PhysAttack {

    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        this.health = MAX_HEALTH;
    }


    @Override
    public String toString() {
        return "Hero{" +
                "MAX_HEALTH=" + MAX_HEALTH +
                ", MIN_HEALTH=" + MIN_HEALTH +
                ", health=" + health +
                ", physAtt=" + physAtt +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if (hero.health - physAtt < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }
}
