package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void runGame() {
        String rules = "Find the greatest common divisor of given numbers.";
        Random rand = new Random();
        int number1;
        int number2;
        String guestion = "";
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            number1 = rand.nextInt(100);
            number2 = rand.nextInt(100);
            guestion = Integer.toString(number1) + " " + Integer.toString(number2);
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = guestion;
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = GCDEuclid(number1, number2);
        }
        Engine.runGame(rules, gameQuestionAnswer);
    }

    public static String GCDEuclid(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return Integer.toString(number1);
    }
}
