

public interface Warriors<BaseCharacter>{
    
    void attack (BaseCharacter target);

    void GetDamage(BaseCharacter target, int damage);

    void death(BaseCharacter target);

}