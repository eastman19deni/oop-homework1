

import java.util.List;



public class Crossbowman extends BaseCharacter {
    int arrows;
    
    public Crossbowman(String name, Integer x, Integer y) {
        super(name, x, y);
        this.arrows = arrows;
    }


    @Override
    public void death() {
        if(this.getHealth() < 1){
            System.out.println("Sorry you cannot save somebody");
        }
    }

    @Override
    public void step(List<BaseCharacter> list, List<BaseCharacter> friends) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }




}