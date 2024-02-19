public class Warrior extends BaseCharacter implements Warriors{

    public Warrior(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y) {
        super(10, name, 100, 80, 50, 20, true, x, y);
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    @Override
    public void attack(BaseCharacter target) {
        super.attack(target);
    }

    @Override
    public void death(BaseCharacter target) {
        super.death(target);
    }

    @Override
    public void getDamage(int damage) {
        super.getDamage(damage);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
    }

    
}