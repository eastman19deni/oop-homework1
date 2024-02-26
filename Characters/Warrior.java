import java.util.ArrayList;
import java.util.List;

public class Warrior extends BaseCharacter{

    public Warrior(String name, Integer x, Integer y) {
        super(1, name, 70, 60, 40, 40, true, x, y);
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
    public String getInfo() {
        return super.getInfo();
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