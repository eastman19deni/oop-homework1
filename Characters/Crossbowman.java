
import java.util.ArrayList;
import java.util.List;



public class Crossbowman extends BaseCharacter {
    int arrows;
    int countArrow;

    public Crossbowman(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x,
            Integer y, int arrows) {
        super(level, name, health, strength, stamina, i, b, x, y);
        this.arrows = arrows;
        countArrow = 10;
    }

    public void death(BaseCharacter target) {
        super.death(target);
    }


    public void attack(BaseCharacter target) {
    }
    
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
        return null;
    }

    public int getArrows() {
        return arrows;
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
    protected int getHealth() {
        // TODO Auto-generated method stub
        return super.getHealth();
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo();
    }

    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        if ((health <= 0) || (arrows == 0)) return;
        BaseCharacter target =nearestEnemy(enemy);
        target.getHit(this.powerHit);
        countArrow--;
    }    
}