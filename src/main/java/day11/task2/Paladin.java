package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    private int healHimSelf;
    private int healTeammate;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
        healHimSelf = 25;
        healTeammate = 10;
    }

    public int getHealHimSelf() {
        return healHimSelf;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
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
