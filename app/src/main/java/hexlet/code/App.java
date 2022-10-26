package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        switch (game) {
            case 1 -> Cli.greeting();
            case 2 -> Even.runGame();
            case 0 -> System.out.println("Exit!");
            default -> System.out.println("Something went wrong!");
        }
    }
}
