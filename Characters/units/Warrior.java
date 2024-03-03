package units;

public class Warrior extends Warriors {


    public Warrior(String name, Integer x, Integer y) {
        super(name, x, y);

    }

    public void death() {
        if (this.getHealth() < 1) {
            System.out.println("Press F");
        }
    }

    public String getInfo(){
        return "Warrior";
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}