package Warriors;
public class Robber extends BaseCharacter implements Warriors{

    public Robber(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y) {
        super(1, name, 80, 60, 75, 30, true, x, y);
        
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
        super.death();
    }

    @Override
    public void getDamage(int damage) {
        // TODO Auto-generated method stub
        super.getDamage(damage);
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
        // TODO Auto-generated method stub
        
    }

    
}