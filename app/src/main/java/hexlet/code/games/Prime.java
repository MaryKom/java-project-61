package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;
    public static void runGame() {
        Random rand = new Random();
        int number;
        String answer = "";
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][Engine.COUNT_OF_ANSWER];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            number = rand.nextInt(MIN_NUMBER, MAX_NUMBER);
            answer = isPrime(number);
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = Integer.toString(number);
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = answer;
        }
        Engine.runGame(rules, gameQuestionAnswer);
    }

    public static String isPrime(int number) {
        if (number == 1) {
            return "no";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
