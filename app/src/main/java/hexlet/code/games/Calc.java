package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_NUMBER = 20;
    private static final char[] OPERATOR = new char[]{'+', '-', '*'};

    public static void runGame() {
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            gameQuestionAnswer[i] = generateRoundData();
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }

    private static int calculate(int numberFirst, int numberSecond, char mathOperations) {
        switch (mathOperations) {
            case '+':
                return numberFirst + numberSecond;
            case '-':
                return numberFirst - numberSecond;
            case '*':
                return numberFirst * numberSecond;
            default:
                throw new RuntimeException("No operator" + mathOperations);
        }
    }

    private static String[] generateRoundData() {
        int number1 = Utils.getMaxRandom(MAX_NUMBER);
        int number2 = Utils.getMaxRandom(MAX_NUMBER);
        char mathOperator = OPERATOR[Utils.getMaxRandom(OPERATOR.length)];
        String[] roundQuestionAnswer = new String[2];
        roundQuestionAnswer[0] = Integer.toString(number1) + " " + mathOperator + " " + Integer.toString(number2);
        roundQuestionAnswer[1] = Integer.toString(calculate(number1, number2, mathOperator));
        return roundQuestionAnswer;
    }
}
