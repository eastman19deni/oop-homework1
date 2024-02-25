import java.util.List;
abstract public class Bows extends BaseCharacter {

    public Bows(String name, int x, int y) {
        super(name, x, y);
        this.stamina = 3;

    }

    protected Integer arrows;
    
    public Integer getArrows() {return arrows;}

    public void setArrows(Integer arrows) {this.arrows = arrows;}
 

    public void attack(BaseCharacter target){
        int damage = r.nextInt(5);
        this.arrows--;
        target.getDamage(damage);
    }

    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {

        if (!isDead() || getArrows() <= 0) return;
            attack(nearestEnemy(list));
            System.out.println(toString());

    }
        
    
    
}
