
import java.util.ArrayList;
import java.util.List;


public class Sniper extends BaseCharacter implements Bows{
    int bullets;
    public Sniper(String name, Integer x, Integer y) {
        super(1, name, 60, 50, 40, 20, true, x, y);
        this.bullets = bullets;
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
    protected double getDistanceTo(BaseCharacter other) {
        return super.getDistanceTo(other);
    }

    @Override
    protected int getHealth() {
        return super.getHealth();
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
        return super.nearestEnemy(targets);
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
    }

    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    
}
