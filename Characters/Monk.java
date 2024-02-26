import java.util.ArrayList;
import java.util.List;

public class Monk extends BaseCharacter{
    int faith;

    public Monk(String name,Integer x, Integer y) {
        super(1, name, 50, 30, 20, 20, true, x, y);
    }

    public int getFaith() {
        return faith;
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
        if(target.getHealth() - damage >0){
            health -= damage;
        }else{
            super.death(target);
        }
        super.getDamage(damage);
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
