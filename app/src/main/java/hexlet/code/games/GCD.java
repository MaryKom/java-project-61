package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_NUMBER = 100;
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            gameQuestionAnswer[i] = roundQuestionAnswer();
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }

    public static String gcdEuclid(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return Integer.toString(number1);
    }

    private static String[] roundQuestionAnswer() {
        int number1 = Utils.getMaxRandom(MAX_NUMBER);
        int number2 = Utils.getMaxRandom(MAX_NUMBER);
        String[] roundQuestionAnswer = new String[2];
        roundQuestionAnswer[0] = Integer.toString(number1) + " " + Integer.toString(number2);
        roundQuestionAnswer[1] = gcdEuclid(number1, number2);
        return roundQuestionAnswer;
    }
}
