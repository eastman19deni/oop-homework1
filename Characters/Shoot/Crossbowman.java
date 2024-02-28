

public class Crossbowman extends Bows {
    
    public Crossbowman(String name, Integer x, Integer y) {
        super(name, x, y);
    }

    public void death() {
        if(this.getHealth() < 1){
            System.out.println("Sorry you cannot save somebody");
        }
    }

    public String getInfo() {
        return "Crossbows";
    }
    

}