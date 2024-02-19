public class Monk extends BaseCharacter implements Witchers {
    int pray;

    public Monk(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x, Integer y) {
        super(40, name, 60, 1, 50, 40, true, x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
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

    public void GetDamage(BaseCharacter target, int damage) {
        if (target.getHealth() - damage > 0) {
            health -= damage;
        } else {
            super.death(target);
        }
    }

    public void death(BaseCharacter target) {
        super.death(target);
    }

    public void healing(BaseCharacter target) {
    }
}
