
import java.util.List;

public class Wizard extends BaseCharacter{

    public Wizard(String name, Integer x, Integer y) {
        super(name, x, y);
       
    }

    protected int mana;

    @Override
    public void death() {
        if(this.getHealth() < 1){
            System.out.println("run forest run!!!!!!!!");
        }
    }

    @Override
    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {
        // TODO Auto-generated method stub
        
    }

}
