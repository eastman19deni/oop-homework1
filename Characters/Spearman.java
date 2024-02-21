import java.util.ArrayList;
import java.util.List;

public class Spearman extends BaseCharacter{

    public Spearman(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y) {
        super(level, name, health, strength, stamina, i, b, x, y);
        //TODO Auto-generated constructor stub
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
    public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
        // TODO Auto-generated method stub
        return super.nearestEnemy(targets);
    }

    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        // TODO Auto-generated method stub
        
    }
    
}
