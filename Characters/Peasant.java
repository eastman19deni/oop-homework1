import java.util.ArrayList;

public class Peasant extends BaseCharacter {
    
    public Peasant(String name, Integer x, Integer y) {
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
    public void step(ArrayList<BaseCharacter> enemy) {
        // TODO Auto-generated method stub
        
    }

}
