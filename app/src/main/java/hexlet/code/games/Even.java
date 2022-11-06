package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 1000;

    public static void runGame() {
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            gameQuestionAnswer[i] = getRoundQuestionAnswer();
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] getRoundQuestionAnswer() {
        int question = Utils.getMaxRandom(MAX_NUMBER);
        String[] roundQuestionAnswer = new String[2];
        roundQuestionAnswer[0] = Integer.toString(question);
        roundQuestionAnswer[1] = isEven(question) ? "yes" : "no";
        return roundQuestionAnswer;
    }
}
