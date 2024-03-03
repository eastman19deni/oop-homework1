package units;

import java.util.ArrayList;

    // Арбалетчик. Своё свойство - количество стрел
    public class Crossbowman extends Bows {
        int countArrow;
        public Crossbowman(String name, int x, int y) {
            super(name, 150, 20);
            countArrow = 10;
        }


        public String toString() {
            return super.toString() + ", \u27b6 : " + countArrow;
        }

        public void step(ArrayList<BaseCharacter> enemy, ArrayList<BaseCharacter> friend) {
            if ((health<=0) || (countArrow == 0)) return;
            BaseCharacter target = super.nearestEnemy(enemy);
            if (target == null) return;
            target.getHit(this.powerHit);

            for (BaseCharacter baseCharacter : friend) {
                if (baseCharacter.getInfo().equals("Фермер") && !((Peasant)baseCharacter).flag) {
                    ((Peasant)baseCharacter).flag = true;
                    return;
                }

            }
            countArrow--;




        }
        public int getCountArrow() {
            return countArrow;
        }
        public String getInfo(){
            return "Арбалетчик";
        };



    }