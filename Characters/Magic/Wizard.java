

public class Wizard extends Witchers{

    public Wizard(String name, Integer x, Integer y) {
        super(name, x, y);
       
    }

    public void death() {
        if(this.getHealth() < 1){
            System.out.println("run forest run!!!!!!!!");
        }
    }
}
