
import java.util.List;

public class Spearman extends Warriors{
    
    public Spearman(String name, Integer x, Integer y) {
        super(name, x, y);
    }
    public void death(){
        if(this.getHealth()<1){
            System.out.println("Don't be sad you will be in heaven");
        }
    }
    
    public String getInfo(){
        return "Spearman";
    }

}
