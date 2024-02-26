import java.util.ArrayList;
import java.util.List;

public class Spearman extends BaseCharacter{

    public Spearman(String name, Integer x, Integer y) {
        super(1, name, 70, 60, 40, 40, true, x, y);
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

    @Override
    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
    
}
