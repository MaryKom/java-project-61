package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void runGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Random rand = new Random();
        int number;
        String answer = "";
        String[][] gameQuestionAnswer = new String [Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            number = rand.nextInt(1, 50);
            answer = isPrime(number);
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = Integer.toString(number);
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = answer;
        }
        Engine.runGame(rules, gameQuestionAnswer);
    }

    public static String isPrime (int number) {
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
