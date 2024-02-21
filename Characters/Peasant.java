import java.util.ArrayList;

public class Peasant extends BaseCharacter {
    public Peasant(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y) {
        super(level, name, health, strength, stamina, i, b, x, y);

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
