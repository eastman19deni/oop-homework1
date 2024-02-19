public class Peasant extends BaseCharacter implements Warriors{

    public Peasant(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y) {
        super(1, name, 40, 30, 100, 30, true, x, y);
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
    protected int getStamina() {
        return super.getStamina();
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
        
    }
    public void work(int hour) {
        stamina -= hour / 4;
    }

    
}