
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
//import java.util.List;
import java.util.Random;
import java.util.Scanner;

import units.*;

// public class main {
//     public static List<BaseCharacter> BlessedTeam = new ArrayList<>(teamCreator(1));
//     public static List<BaseCharacter> DevilTeam = new ArrayList<>(teamCreator(10));
//     public static ArrayList<BaseCharacter> allTeam = new ArrayList<>();

//     public static void main(String[] args) {

//         System.out.println("Команда №1: ");
//         for (BaseCharacter unit : BlessedTeam) {
//             System.out.printf("Имя: %s, Класс: %s, Здоровье: %d, Координаты: %d,%d\n", unit.getName(),
//                     unit.getClass().getSimpleName(), unit.getHealth(), unit.position.getX(), unit.position.getY());
//         }

//         System.out.println();

//         System.out.println("Команда №2: ");
//         for (BaseCharacter unit : DevilTeam) {
//             System.out.printf("Имя: %s, Класс: %s, Здоровье: %d, Координаты: %d,%d\n", unit.getName(),
//                     unit.getClass().getSimpleName(), unit.getHealth(), unit.position.getX(), unit.position.getY());
//         }

//         System.out.println();

//         allTeam.addAll(BlessedTeam);
//         allTeam.addAll(DevilTeam);

//         allTeam.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());

//         System.out.println("-".repeat(56));
//         Scanner scanner = new Scanner(System.in);
//         boolean flag = true;
//         while (true) {

//             View.view();
//             scanner.nextLine();
//             int summ1HP = 0;
//             int summ2HP = 0;
//             for (BaseCharacter unit : BlessedTeam) {
//                 summ1HP += unit.getHealth();
//             }
//             for (BaseCharacter unit : DevilTeam) {
//                 summ2HP += unit.getHealth();
//             }
//             if (summ1HP == 0) {
//                 System.out.println("Победила команда darkTeam");
//                 flag = false;
//                 break;
//             }
//             if (summ2HP == 0) {
//                 System.out.println("Победила команда holyTeam");
//                 flag = false;
//                 break;
//             }
//             for (BaseCharacter unit : allTeam) {
//                 if (BlessedTeam.contains(unit))
//                     unit.step(DevilTeam, BlessedTeam);
//                 else
//                     unit.step(BlessedTeam, DevilTeam);
//             }

//         }
//         scanner.close();

//     }

//     private static String fillName() {
//         return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
//     }

//     private static ArrayList<BaseCharacter> teamCreator(int y) {
//         ArrayList<BaseCharacter> team = new ArrayList<BaseCharacter>();
//         int teamCount = 10;
//         for (int i = 1; i < teamCount + 1; i++) {
//             switch (new Random().nextInt(9)) {
//                 case 1:
//                     team.add(new Monk(fillName(), i, y));
//                     break;
//                 case 2:
//                     team.add(new Wizard(fillName(), i, y));
//                     break;
//                 case 3:
//                     team.add(new Crossbowman(fillName(), i, y));
//                     break;
//                 case 4:
//                     team.add(new Sniper(fillName(), i, y));
//                     break;
//                 case 5:
//                     team.add(new Peasant(fillName(), i, y));
//                     break;
//                 case 6:
//                     team.add(new Warrior(fillName(), i, y));
//                     break;
//                 case 7:
//                     team.add(new Spearman(fillName(), i, y));
//                     break;
//                 case 8:
//                     team.add(new Robber(fillName(), i, y));
//             }
//         }
//         return team;
//     }
// }

public class Main {
    public static ArrayList<BaseCharacter> BlessedTeam = new ArrayList<>();
    public static ArrayList<BaseCharacter> DevilTeam = new ArrayList<>();
    public static ArrayList<BaseCharacter> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();

        // Заполняем команды рандомом. Метод init
        init();

        // Вывод полного списка команд, чтобы посмотреть, как сработал рандом.
        System.out.println("Команда №1: ");
        for (BaseCharacter unit : BlessedTeam) {
            System.out.printf("Имя: %s, Класс: %s, Здоровье: %d, Координаты: %d,%d\n", unit.getName(),
                    unit.getClass().getSimpleName(), unit.getHealth(), unit.position.getX(), unit.position.getY());
        }

        System.out.println();

        System.out.println("Команда №2: ");
        for (BaseCharacter unit : DevilTeam) {
            System.out.printf("Имя: %s, Класс: %s, Здоровье: %d, Координаты: %d,%d\n", unit.getName(),
                unit.getClass().getSimpleName(), unit.getHealth(), unit.position.getX(), unit.position.getY());
       }
          
        allTeam.addAll(BlessedTeam);
        allTeam.addAll(DevilTeam);
        allTeam.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());

        // allTeam.forEach(n-> n.printShort());
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (true) {

            View.view();
            scanner.nextLine();
            int summ1HP = 0;
            int summ2HP = 0;
            for (BaseCharacter baseCharacter : BlessedTeam) {
                summ1HP += baseCharacter.getHp();
            }
            for (BaseCharacter baseCharacter : DevilTeam) {
                summ2HP += baseCharacter.getHp();
            }
            if (summ1HP == 0) {
                System.out.println("Победила команда DevilTeam");
                flag = false;
                break;
            }
            if (summ2HP == 0) {
                System.out.println("Победила команда BlessedTeam");
                flag = false;
                break;
            }
            for (BaseCharacter unit : allTeam) {
                if (BlessedTeam.contains(unit))
                    unit.step(DevilTeam, BlessedTeam);
                else
                    unit.step(BlessedTeam, DevilTeam);
            }

        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    public static void init() {
        Random random = new Random();
        int teamcount = 10;
        for (int i = 1; i < teamcount + 1; i++) {
            int val = random.nextInt(8);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position team1 = new Position(coordX1, 1);
            Position team2 = new Position(coordX2, 10);
            System.out.println(team1);
            switch (val) {
                case 0:
                    BlessedTeam.add(new Crossbowman(getName(), i, 1));
                    break;
                case 1:
                    BlessedTeam.add(new Wizard(getName(), i, 1));

                    break;
                case 2:
                    BlessedTeam.add(new Monk(getName(), i, 1));

                    break;
                case 3:
                    BlessedTeam.add(new Robber(getName(), i, 1));

                    break;
                case 4:
                    BlessedTeam.add(new Peasant(getName(), i, 1));

                    break;
                case 5:
                    BlessedTeam.add(new Sniper(getName(), i, 1));

                    break;
                case 6:
                    BlessedTeam.add(new Spearman(getName(), i, 1));

                    break;
                case 7:
                    BlessedTeam.add(new Warrior(getName(), i, 1));

            }
        }
        for (int i = 1; i < teamcount + 1; i++) {
            int val = random.nextInt(8);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position team1 = new Position(coordX1, 1);
            Position team2 = new Position(coordX2, 10);
            System.out.println(team1);
            switch (val) {
                case 0:

                    DevilTeam.add(new Crossbowman(getName(), i, 10));
                    break;
                case 1:

                    DevilTeam.add(new Wizard(getName(), i, 10));
                    break;
                case 2:

                    DevilTeam.add(new Monk(getName(), i, 10));
                    break;
                case 3:

                    DevilTeam.add(new Robber(getName(), i, 10));
                    break;
                case 4:

                    DevilTeam.add(new Peasant(getName(), i, 10));
                    break;
                case 5:

                    DevilTeam.add(new Sniper(getName(), i, 10));
                    break;
                case 6:

                    DevilTeam.add(new Spearman(getName(), i, 10));
                    break;
                case 7:
                    DevilTeam.add(new Warrior(getName(), i, 10));
                    break;
            }
        }
    }
}