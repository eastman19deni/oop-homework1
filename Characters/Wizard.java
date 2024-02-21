import java.util.ArrayList;
import java.util.List;

public class Wizard extends BaseCharacter{

    int mana;

    public Wizard(String name,Integer x, Integer y) {
        super(1, name, 50, 30, 20, 20, true, x, y);
    }

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
    protected double getDistanceTo(BaseCharacter other) {
        // TODO Auto-generated method stub
        return super.getDistanceTo(other);
    }

    @Override
    public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
        // TODO Auto-generated method stub
        return super.nearestEnemy(targets);
    }

    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        // TODO Auto-generated method stub
        
    }
}
