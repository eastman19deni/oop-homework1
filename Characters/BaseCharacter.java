import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;


public abstract class BaseCharacter implements MyInterface{
    protected int level;
    protected static String name;
    protected int health;
    protected int strength;
    protected int stamina;
    protected Position position;
    protected int maxHealth;
    protected static Random r;
    protected int powerHit;
    protected int speed;
    
    static{
        BaseCharacter.r = new Random();
    }

    public BaseCharacter(int level, String name, int health, int strength, int stamina, int i, boolean b, Integer x, Integer y) {
        this.level = level;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.stamina = stamina;
        this.position = new Position(0, 0);  // Assuming a default position at (0, 0)
    }

    public BaseCharacter(String name2, int i, int j) {
        //TODO Auto-generated constructor stub
    }

    public int getSpeed(){
        return speed;
    }

    protected int getHealth() {
        return health;
    }

    public void getDamage(int damage) {
        this.health -= damage;
        if (health < 0) health = 0; 
        if(health >= maxHealth) health = maxHealth;
    }

    public void attack(BaseCharacter target) {
        int damage = BaseCharacter.r.nextInt(10);
        target.getDamage(damage);
    }
    public void getHit(float damage){
        health -= damage;
        if(health < 0)health = 0;
        if(health > maxHealth);
    }

    public String getName() {
        return new String(this.name);
    }

    protected int getStamina() {
        return stamina;
    }

    public void death(BaseCharacter target) {
        if (target.getHealth() < 1) {
            System.out.println("Your hero died");
        }
    }

    protected double getDistanceTo(BaseCharacter other) {
        int x1 = this.position.getX();
        int y1 = this.position.getY();
        int x2 = other.position.getX();
        int y2 = other.position.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String getInfo() {
        return new String(this.getName() + ", Health: " + this.getHealth() + ", Stamina: " + this.getStamina());
    }

    // public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
    //     if (targets.isEmpty()) {
    //         return null; // Handle empty list case
    //     }

    //     BaseCharacter nearest = null;
    //     double minDistance = Double.MAX_VALUE;

    //     for (BaseCharacter hero : targets) {
    //         double distance = getDistanceTo(hero);
    //         if (distance < minDistance && hero.isDead()) {
    //             minDistance = distance;
    //             nearest = hero;
    //         }
    //     }

    //     return nearest;
    // }
    public BaseCharacter nearestEnemy(List<BaseCharacter> targets){
        BaseCharacter target = null;
        double minDistance = 10;
        for(BaseCharacter hero : targets){
            if(position.getDistanse(hero) < minDistance && hero.isDead()){
                minDistance = position.getDistanse(hero);
                target = hero;
            }
        }
        return target;
    }

    protected void death() {
        if (getHealth() < 0) {
            System.out.println("Your hero die");
        }
    }
    
    public boolean isDead(){
        if (this.getHealth() <= 0) {
            return false;
        }
        return true;
    }
}
