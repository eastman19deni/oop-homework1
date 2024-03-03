package units;

public class Robber extends Warriors{

    public Robber(String name, Integer x, Integer y) {
        super(name, x, y);
        
    }

    public void death() {
        if(this.getHealth()<1){
            System.out.println("you were the best but not like pro");
        }
    }

    public String getInfo() {

        return "Robber";
    }

}