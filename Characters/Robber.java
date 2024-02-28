
import java.util.List;

public class Robber extends BaseCharacter{
    public Robber(String name, Integer x, Integer y) {
        super(name, x, y);
        
    }

    int steal;

    @Override
    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {

    }

    @Override
    public void death() {
        if(this.getHealth()<1){
            System.out.println("you were the best but not like pro");
        }
    }
    @Override
    public String getInfo() {

        return "Robber";
    }

}