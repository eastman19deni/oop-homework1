
import java.util.List;

public class Warrior extends BaseCharacter {

    protected int rage;
    protected Position position;

    public Warrior(String name, Integer x, Integer y) {
        super(name, x, y);
        this.rage = 20;
        this.speed = 2;
        this.position = new Position(x, y);
    }

    public void att(BaseCharacter target) {
        int damage = r.nextInt(5);
        this.rage--;
        target.GetDamage(damage);
    }

    public void death() {
        if (this.getHealth() < 1) {
            System.out.println("Press F");
        }
    }
    public String getInfo(){
        return "Warrior";
    }

    public void step(List<BaseCharacter> targets, List<BaseCharacter> friends) {
        if (getHealth() < 0)
            return;
        BaseCharacter unit = nearestEnemy(targets);
        if (position.getDistanse(unit) < 2) {
            att(unit);
            return;
        }
        Position diff = this.position.getDiff(unit.position);
        Position currentPossition = new Position(position.getX(), position.getY());
        if (Math.abs(diff.getX()) > Math.abs(diff.getY())) {
            position.setX(position.getX() + diff.getX() > 0 ? 1 : -1);
        } else {
            position.setY(position.getY() + diff.getY() > 0 ? 1 : -1);
        }
        friends.forEach(n ->{
            if(n.position.equals(position)&& n.getHealth()>0){
                this.position = currentPossition;
            }
        });

    }

}