

public class Sniper extends Bows{    

    public Sniper(String name, Integer x, Integer y) {
        super(name, x, y);
        this.arrows = 5;
    }

    public void death() {
        if (this.getHealth() < 1) {
            System.out.println("Неточность - вежливость снайперов и это моя последняя...");
        }
    }

    public String getInfo() {
        return "Sniper";
    }
}