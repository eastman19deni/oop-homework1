
import java.util.ArrayList;



public class Sniper extends Bows{    

    public Sniper(String name, Integer x, Integer y) {
        super(name, x, y);
        this.arrows = 5;
    }

    @Override
    public void death() {
        if (this.getHealth() < 1) {
            System.out.println("Неточность - вежливость снайперов и это моя последняя...");
        }
    }

    @Override
    public void step(ArrayList<BaseCharacter> enemy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }    


    
}