
import java.util.List;

public class Spearman extends BaseCharacter{
    protected int resistance;
    public Spearman(String name, Integer x, Integer y) {
        super(name, x, y);
    }
    public void death(){
        if(this.getHealth()<1){
            System.out.println("Don't be sad you will be in heaven");
        }
    }
    @Override
    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {

    }

}
