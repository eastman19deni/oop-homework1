
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
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        List<BaseCharacter> team1 = new ArrayList<>(teamCreator(0));
        List<BaseCharacter> team2 = new ArrayList<>(teamCreator(9));

        System.out.println("Команда №1: ");
        for (BaseCharacter unit : team1) {
            System.out.printf("Имя: %s, Класс: %s, Здоровье: %d, Координаты: %d,%d\n", unit.getName(),
                    unit.getClass().getSimpleName(), unit.getHealth(), unit.position.getX(), unit.position.getY());
        }

        System.out.println();

        System.out.println("Команда №2: ");
        for (BaseCharacter unit : team2) {
            System.out.printf("Имя: %s, Класс: %s, Здоровье: %d, Координаты: %d,%d\n", unit.getName(),
                    unit.getClass().getSimpleName(), unit.getHealth(), unit.position.getX(), unit.position.getY());
        }

        System.out.println();

        ArrayList<BaseCharacter> all = new ArrayList<>();
        all.addAll(team1);
        all.addAll(team2);

        all.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());

        System.out.println("-".repeat(56));

        Scanner scan = new Scanner(System.in);
        boolean work = true;
        while (work) {
            if (scan.nextLine() == "") {

                for (BaseCharacter element : all) {
                    if (team1.contains(element)) {
                        element.step(team2, team1);
                    } else {
                        element.step(team1, team2);
                    }
                }
            } else
                work = false;
        }
        scan.close();

        for (BaseCharacter unit : all) {
            System.out.printf("Имя: %s, Здоровье: %d, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getHealth(),
                    unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }

        System.out.println();

        System.out.println("-".repeat(56));

        System.out.println(all.get(0).nearestEnemy(team2).toString());

    }

    private static String fillName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    private static ArrayList<BaseCharacter> teamCreator(int y) {
        ArrayList<BaseCharacter> team = new ArrayList<BaseCharacter>();
        int teamCount = 10;
        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1)) {
                case 1:
                    team.add(new Monk(fillName(), i, y));
                    break;
                case 2:
                    team.add(new Wizard(fillName(), i, y));
                    break;
                case 3:
                    team.add(new Crossbowman(fillName(), i, y));
                    break;
                case 4:
                    team.add(new Sniper(fillName(), i, y));
                    break;
                case 5:
                    team.add(new Peasant(fillName(), i, y));
                    break;
                case 6:
                    team.add(new Warrior(fillName(), i, y));
                    break;
                case 7:
                    team.add(new Spearman(fillName(), i, y));
                    break;
                case 8:
                    team.add(new Robber(fillName(), i, y));
            }
        }
        return team;
    }

}
