import java.util.ArrayList;
import java.util.List;

public class Wizard extends BaseCharacter{

    public Wizard(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y) {
        super(level, name, 50, 70, 50, 40, true, x, y);
        //TODO Auto-generated constructor stub
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
