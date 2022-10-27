package hexlet.code;
import java.util.Scanner;


public class Engine {
    public static int NUMBER_OF_ROUNDS = 3;
    public static int NUMBER_OF_QUESTION = 0;
    public static int NUMBER_OF_ANSWER = 1;
    private static Scanner sc = new Scanner(System.in);

    public static void runGame(String rules, String[][] gameQuestionAnswer) {
        Cli cli = new Cli();
        cli.greeting();
        System.out.println(rules);
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + gameQuestionAnswer[i][NUMBER_OF_QUESTION]);
            System.out.print("Answer: ");
            String answer = sc.next();
            if (answer.equals(gameQuestionAnswer[i][NUMBER_OF_ANSWER])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + gameQuestionAnswer[i][NUMBER_OF_ANSWER]
                        + "'.\nLet's try again, " + cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");
    }
}
