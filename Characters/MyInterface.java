import java.util.ArrayList;

public interface MyInterface {
    String enemy = null;
    void step(ArrayList<BaseCharacter> enemy);

    BaseCharacter target = nearestEnemy(enemy);
    static BaseCharacter nearestEnemy(String enemy2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nearestEnemy'");
    }
    
    
}
