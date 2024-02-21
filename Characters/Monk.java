import java.util.ArrayList;

public class Monk extends BaseCharacter{
    int faith;

    public Monk(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x, Integer y,
            int faith) {
        super(level, name, health, strength, stamina, i, b, x, y);
        this.faith = faith;
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
}
