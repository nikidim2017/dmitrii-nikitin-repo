package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {


    private int healHimSelf;
    private int healTeammate;
    private int magicAtt;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.2;
        magicAtt = 20;
        healHimSelf = 25;
        healTeammate = 10;
    }

    public int getHealHimSelf() {
        return healHimSelf;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    public int getMagicAtt() {
        return magicAtt;
    }


    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - magicAtt < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

}
