
import java.util.List;

public interface MyInterface {
    String enemy = null;

    BaseCharacter target = nearestEnemy(enemy);
    static BaseCharacter nearestEnemy(String enemy2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nearestEnemy'");
    }
    void step(List<BaseCharacter> list,List<BaseCharacter> friends);
    
}
