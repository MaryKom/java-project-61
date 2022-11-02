package hexlet.code;
import java.util.Scanner;


public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void runGame(String rules, String[][] gameQuestionAnswer) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        System.out.println(rules);
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String question = gameQuestionAnswer[i][0];
            String answerRight = gameQuestionAnswer[i][1];
            System.out.println("Question: " + question);
            System.out.print("Answer: ");
            String answer = sc.next();
            if (answer.equals(answerRight)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + answerRight + "'.\nLet's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
