package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    private int healHimSelf;
    private int healTeammate;
    private int magicAtt;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
        magicAtt = 15;
        healHimSelf = 50;
        healTeammate = 30;
    }


    public int getHealHimSelf() {
        return healHimSelf;
    }

    public int getHealTeammate() {
        return healTeammate;
    }


    @Override
    public String toString() {
        return "Shaman{" +
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

    @Override
    public void healHimself() {
        if (health + getHealHimSelf() > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += getHealHimSelf();
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + getHealTeammate() > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += getHealTeammate();
        }
    }

}
