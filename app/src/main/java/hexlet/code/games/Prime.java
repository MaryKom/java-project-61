package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;

    public static void runGame() {
        int countOfAnswer = 2;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][countOfAnswer];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            gameQuestionAnswer[i] = roundQuestionAnswer();
        }
        Engine.runGame(RULES, gameQuestionAnswer);
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

    private static String[] roundQuestionAnswer() {
        int number = Utils.getMinMaxRandom(MIN_NUMBER, MAX_NUMBER);
        String[] roundQuestionAnswer = new String[2];
        roundQuestionAnswer[0] = Integer.toString(number);
        roundQuestionAnswer[1] = isPrime(number);
        return roundQuestionAnswer;
    }
}
