import java.util.List;


public class Crossbowman extends BaseCharacter implements Bows{
    int arrows;

    public Crossbowman(String name, Integer x, Integer y) {
        super(1, name, 60, 50, 40, 20, true, x, y);
        //this.arrows = arrows;
    }
    
    @Override
    public void death(BaseCharacter target) {
        super.death(target);
    }

    @Override
    public void GetDamage(BaseCharacter target, int damage) {
    }

    @Override
    public void attack(BaseCharacter target) {
    }
    
    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    @Override
    public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
        return null;
    }

    public int getArrows() {
        return arrows;
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

    
}