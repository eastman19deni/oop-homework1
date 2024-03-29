package units;


import java.util.List;

import java.util.Random;

public abstract class BaseCharacter implements MyInterface {
    protected int level;
    protected static String name;
    protected int health;
    protected int strength;
    protected int stamina;
    public Position position;
    protected int maxHealth;
    protected static Random r;
    protected int speed;
    protected int agility;
    protected boolean status;
    protected int powerHit;

    public List<BaseCharacter> units;

    static {
        BaseCharacter.r = new Random();
    }

    public BaseCharacter(String name, Integer x, Integer y) {
        this.level = 1;
        this.name = name;
        this.health = 50;
        this.strength = 30;
        this.agility = 20;
        this.stamina = 30;
        this.maxHealth = health;
        this.speed = speed;
        this.status = true;
        this.position = new Position(x, y);
    }
    public String getName(){
        String str = new String(this.name);
        return str;
    }
    public int getSpeed(){return speed;}

    public int getHealth(){return health;}

    public void setHealth(int health){this.health = health;}

    public int getMaxHealth(){return maxHealth;}

    public int getStamina(){return stamina;}

    public String toString(){
        return name +  ", Hp: " + health + ", 🗡️: ";
    }

    public Boolean getStatus(){return status;}
    
    public void GetDamage(int damage){
        this.health -= damage;
        if(health<0){
            health = 0;
            death();
        }
        if(health >= maxHealth) health = maxHealth;
    }

    public void death(){
        if(getHealth()< 1){
            System.out.println("Your hero die");
        }
    }

//    public String getInfo(){
//        String resStr = new String(getName()+getHealth()+position.getPosition()+getStatus());
//        return resStr;
//    }
    public String getInfo(){
    return " ";
};

    public BaseCharacter nearestEnemy(List<BaseCharacter> targets) {
        if (targets.isEmpty()) {
            return null; // Handle empty list case
        }

        BaseCharacter nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (BaseCharacter hero : targets) {
            double distance = position.getDistanse(hero.position);
            if (distance < minDistance && hero.health > 0) {
                minDistance = distance;
                nearest = hero;
            }
        }

        return nearest;
    }
    public void getHealing(int heal){
        if(this.health < maxHealth){
            if(this.health + heal > maxHealth){
                this.health = maxHealth;
            }else{
                this.health += heal;
            }
        }
    }

    public boolean isDead(){
        if(this.getHealth() <= 0){
            return false;
        }
        return true;
    }

    public void att(BaseCharacter target){}

    public void getHit(float damage) {
        health -= damage;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;

    }
    public int getHp(){
        return health;
    }
}