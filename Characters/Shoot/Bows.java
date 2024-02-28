
import java.util.List;
abstract public class Bows extends BaseCharacter {
    protected Integer arrows;

    public Bows(String name, int x, int y) {
        super(name, x, y);
        this.stamina = 3;

    }

    public Integer getArrows() {return arrows;}

    public void setArrows(Integer arrows) {this.arrows = arrows;}
 

    public void att(BaseCharacter target){
        int damage = r.nextInt(5);
        this.arrows--;
        target.GetDamage(damage);
    }

    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {

        if (!isDead() || getArrows() <= 0 || getHealth() <= 0) return;
            att(nearestEnemy(list));
            System.out.println(toString());

    }
}
