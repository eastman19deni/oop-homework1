import java.util.ArrayList;


public class Monk extends Witchers {
    
    public Monk(String name, Integer x, Integer y) {
        super(name, x, y);
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public void toHeal(BaseCharacter target) {
        int damage = r.nextInt(5);
        setFaith(getFaith() - damage);
        target.GetDamage(damage * -1);
    }

    public void death() {
        if (this.getHealth() < 1) {
            System.out.println("God bleashed him!");
        }
    }

    public String getInfo() {
        return "Monk";
    }

    public void step(ArrayList<BaseCharacter> enemy, ArrayList<BaseCharacter> friend) {
        if (getHp() <= 0)
            return;
        ArrayList<BaseCharacter> sortlist = new ArrayList<>(friend);
        ArrayList<BaseCharacter> deadlist = new ArrayList<>();
        sortlist.sort((o1, o2) -> o1.getHp() - o2.getHp());
        int countdead = 0;
        for (BaseCharacter unit : sortlist) {
            if (unit.getHp() == 0) {
                deadlist.add(unit);
                countdead++;
            }
        }
        if (deadlist.size() > 3) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
            deadlist.sort((o1, o2) -> o2.speed - o1.speed);
            deadlist.get(0).health = maxHealth;
            mana = 0;
            System.out.println("Воскресил: " + deadlist.get(0).name);
            flag = false;
            return;
        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        sortlist.get(0).health += 10;
        mana -= 2;
    }


    @Override
    public String toString() {
        return super.toString() + ", Мана : " + mana;
    }
}