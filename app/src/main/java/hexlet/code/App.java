package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        switch (game) {
            case 1 -> Cli.greeting();
            case 2 -> Even.runGame();
            case 3 -> Calc.runGame();
            case 4 -> GCD.runGame();
            case 5 -> Progression.runGame();
            case 0 -> System.out.println("Exit!");
            default -> System.out.println("Something went wrong!");
        }
    }
}
