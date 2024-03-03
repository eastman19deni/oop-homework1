package units;


import java.util.List;


public abstract class Warriors extends BaseCharacter{
    protected int rage;
    protected Position position;
    protected int resistance;
    protected int steal;

    public Warriors(String name, Integer x, Integer y) {
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

    public void step(List<BaseCharacter> targets, List<BaseCharacter> friends) {

        if (!isDead())
            return;
        BaseCharacter unit = nearestEnemy(targets);
        if (position.getDistanse(unit) < 2) {
            att(unit);
            System.out.println(toString());
            return;
        }
        Position diff = this.position.getDiff(unit.position);
        Position currentPos = new Position(position.getX(), position.getY());
        if (Math.abs(diff.getX()) > Math.abs(diff.getY())) {
            position.setX(position.getX() + diff.getX() > 0 ? 1 : -1);
            System.out.println(toString());
        } else
            position.setY(position.getY() + diff.getY() > 0 ? 1 : -1);
        System.out.println(toString());

        friends.forEach(n -> {
            if (n.position.equals(position)) {
                this.position = currentPos;
            }
        });
    }

}