//  Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//  Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). 
//  Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
//   В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
//  Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

/*
 * Крестьянин:    |     Разбойник:      |       Маг:            |       Войн:           |
 * Здоровье       |     Здоровье        |       Айди персонажа  |       Айди персонажа  |
 * Сила           |     Сила            |       Имя             |       Имя             |
 * Ловкость       |     Ловкость        |       Интелект        |       Ловкость        |
 * Выносливать    |     Выносливать     |       Ловкость        |       Интелект        |
 * Уровень        |     Вид оружие      |       Мана            |       Здоровье        |
 * Айди персонажа |                     |       Здоровье        |       Выносливость    |
 * Имя            |                     |       Вид оружия      |       Вид оружия      |
 * Вид оружия     |                     |       Выносливость    |       Сила            |
 * защита         |     защита          |       защита          |       защита          |
 * -----------------------------------------------------------------------------------------
 * Снайпер        |    Арболетчик       |       Монах           |
 * Айди           |    Айди             |       Айди            |
 * Имя            |    Имя              |       Имя             |
 * Здоровье       |    Здоровье         |       Здоровье        |
 * Сила           |    Выносливость     |       Выносливость    |
 * Ловкость       |    Вид оружие       |       Вера            |
 * Выносливость   |    Меткость         |       Вид оружия      |
 * Вид оружия     |    колицество стрел |       Чакра           |
 * Меткость       |    скорость стрельбы|       Интелект        |
 * --------------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Sniper sniper = new Sniper(fillName(), 0, 0);
        Crossbowman crossbowman = new Crossbowman(fillName(), 0, 0);
        Wizard magic = new Wizard(fillName(), 0, 0);
        Peasant peasant = new Peasant(fillName(), 0, 0);
        Warrior warrior = new Warriors(fillName(), 0, 0);

        int teamCount = 10;
        List<BaseCharacter> team1 = new ArrayList<>();
        List<BaseCharacter> team2 = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team1.add(new Monk(fillName(), i, 0));
                    break;
                case 2:
                    team1.add(new Wizard(fillName(), i, 0));
                    break;
                case 3:
                    team1.add(new Crossbowman(fillName(), i, 0));
                    break;
                case 4:
                    team1.add(new Sniper(fillName(), i, 0));
                    break;
                case 5:
                    team1.add(new Peasant(fillName(), i, 0));
                    break;
                case 6:
                    team1.add(new Raider(fillName(), i, 0));
                    break;
                case 7:
                    team1.add(new Spearman(fillName(), i, 0));
                    break;
            }
        }

        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team2.add(new Monk(fillName(), i, 9));
                    break;
                case 2:
                    team2.add(new Wizard(fillName(), i, 9));
                    break;
                case 3:
                    team2.add(new Crossbowman(fillName(), i, 9));
                    break;
                case 4:
                    team2.add(new Sniper(fillName(), i, 9));
                    break;
                case 5:
                    team2.add(new Peasant(fillName(), i, 5));
                    break;
                case 6:
                    team2.add(new Raider(fillName(), i, 9));
                    break;
                case 7:
                    team2.add(new Spearman(fillName(), i, 9));
                    break;
            }
        }
/*
 * #Сделал еще один вариант алгоритма распределения по командам 
 */
        // for (int i = 0; i < teamCount; i++) {
            
        //     switch (new Random().nextInt(4)) {
        //         case 0:
        //             team1.add(new Monk(fillName(), i, 0));
        //             team2.add(new Wizard(fillName(), i, 9));
        //             break;
        //         case 1:
        //             team1.add(new Crossbowman(fillName(), i, 0));
        //             team2.add(new Sniper(fillName(), i, 9));
        //             break;
        //         case 2:
        //             team1.add(new Raider(fillName(), i, 0));
        //             team2.add(new Spearman(fillName(), i, 9));
        //             break;               
        //         case 3:
        //             team1.add(new Peasant(fillName(), i, 0));
        //             team2.add(new Peasant(fillName(), i, 9));
        //             break;
        //     }
        // }
        for (BaseCharacter unit : team1) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();
        for (BaseCharacter unit : team2) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }   
        // Проба метода getInfo
        System.out.println(team1.get(0).getInfo());
        System.out.println("------------------");

        // визуально видно, что персонаж из второй команды, который стоит не на 9 клетке а на 5, определяется как цель
        System.out.println(team1.get(2).nearestEnemy(team2));
    }

    private static int fillName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
}
