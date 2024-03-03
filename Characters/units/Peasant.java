package units;
import java.util.List;


public class Peasant extends BaseCharacter {
    protected boolean flag;
    public Peasant(String name, Integer x, Integer y) {
        super(name, x, y);
        this.speed = 1;
    }

    int unity;
    int hour;

    public void work(int unity){
        stamina -= hour / 4;
    }

    @Override
    public void death() {
        if(this.getHealth()<1){
            System.out.println("you was good but not enough ");
        }
    }

    @Override
    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {
        if(health <= 0) return;
        flag = false;
        
    }
    
    public String getInfo(){
        return "Peasant";
    }

}
