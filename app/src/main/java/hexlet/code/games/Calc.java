package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_NUMBER = 20;
    private static final char[] OPERATOR = new char[]{'+', '-', '*'};

    public static void runGame() {
        int countOfAnswer = 2;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][countOfAnswer];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            gameQuestionAnswer[i] = roundQuestionAnswer();
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }

    private static int calculate(int numberFirst, int numberSecond, char mathOperations) {
        int result = 0;
        switch (mathOperations) {
            case '+':
                result = numberFirst + numberSecond;
                break;
            case '-':
                result = numberFirst - numberSecond;
                break;
            case '*':
                result = numberFirst * numberSecond;
                break;
            default:
                break;
        }
        return result;
    }

    private static String[] roundQuestionAnswer() {
        int number1 = Utils.getMaxRandom(MAX_NUMBER);
        int number2 = Utils.getMaxRandom(MAX_NUMBER);
        char mathOperator = OPERATOR[Utils.getMaxRandom(OPERATOR.length)];
        String[] roundQuestionAnswer = new String[2];
        roundQuestionAnswer[0] = Integer.toString(number1) + " " + mathOperator + " " + Integer.toString(number2);
        roundQuestionAnswer[1] = Integer.toString(calculate(number1, number2, mathOperator));
        return roundQuestionAnswer;
    }
}
