package Witcher;

public class Witcher extends BaseCharacter implements Witchers {
    int mana;

    public Witcher(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y) {
        super(99, name, 50, 70, 10, 1, true, x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    @Override
    public void attack(BaseCharacter target) {
        // TODO Auto-generated method stub
        super.attack(target);
    }

    @Override
    public void death(BaseCharacter target) {
        // TODO Auto-generated method stub
        super.death(target);
    }

    @Override
    public void getDamage(int damage) {
        // TODO Auto-generated method stub
        super.getDamage(damage);
    }

    @Override
    protected double getDistanceTo(BaseCharacter other) {
        // TODO Auto-generated method stub
        return super.getDistanceTo(other);
    }

    @Override
    protected int getHealth() {
        // TODO Auto-generated method stub
        return super.getHealth();
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo();
    }

    @Override
    protected int getStamina() {
        // TODO Auto-generated method stub
        return super.getStamina();
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
        // TODO Auto-generated method stub

    }

}