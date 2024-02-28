import java.util.List;

public class Witchers extends BaseCharacter{

    public Witchers(String name, Integer x, Integer y) {
        super(name, x, y);
        this.speed = 1;
    }

    public int getSpeed(){
        return speed;
    }

    public void att(BaseCharacter target){
        int damage = r.nextInt(5);
        target.GetDamage(damage);
    }
    public void step(List<BaseCharacter> targets, List<BaseCharacter> friends) {
                        
        if (!isDead()) return;
            BaseCharacter unit = nearestEnemy(targets);
            if (position.getDistanse(unit) < 2) {
                att(unit);
                System.out.println(toString());
                return;
            }
            Position diff = this.position.getDiff(unit.position);
            Position currentPos = new Position(position.getX(), position.getY());
            if (Math.abs(diff.getX()) >  Math.abs(diff.getY())){
                position.setX(position.getX() + diff.getX() > 0 ? 1 : -1);
                System.out.println(toString());
            } else position.setY(position.getY() + diff.getY() > 0 ? 1 : -1);
                System.out.println(toString());
            friends.forEach(n -> {
                if (n.position.equals(position)) {
                    this.position = currentPos;
                }
            });
    }

}
