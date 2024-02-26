import java.util.ArrayList;
import java.util.List;

public class Robber extends BaseCharacter{
    int fortune;

    public Robber(String name, Integer x, Integer y) {
        super(1, name, 70, 60, 40, 40, true, x, y);
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
    public void step(ArrayList<BaseCharacter> enemy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }    
}