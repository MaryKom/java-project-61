package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int FIRST_NUMBER_PROGRESSION_MAX = 10;
    private static final int D_PROGRESSION_MIN = 1;
    private static final int D_PROGRESSION_MAX = 7;
    private static final int COUNT_PROGRESSION_MIN = 5;
    private static final int COUNT_PROGRESSION_MAX = 10;

    public static void runGame() {
        int countOfAnswer = 2;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][countOfAnswer];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            gameQuestionAnswer[i] = roundQuestionAnswer();
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }

    private static int[] generateProgression(int numberProgression1, int dProgression, int countProgression) {
        int[] progression = new int[countProgression];
        for (int j = 0; j < countProgression; j++) {
            var numberProgression = numberProgression1 + j * dProgression;
            progression[j] = numberProgression;
        }
        return progression;
    }

    private static String[] roundQuestionAnswer() {
        int numberProgression1 = Utils.getMaxRandom(FIRST_NUMBER_PROGRESSION_MAX);
        int dProgression = Utils.getMinMaxRandom(D_PROGRESSION_MIN, D_PROGRESSION_MAX);
        int countProgression = Utils.getMinMaxRandom(COUNT_PROGRESSION_MIN, COUNT_PROGRESSION_MAX);
        int missProgression = Utils.getMaxRandom(countProgression);
        int[] progression = generateProgression(numberProgression1, dProgression, countProgression);
        String question = "";
        String[] roundQuestionAnswer = new String[2];
        for (int i = 0; i < countProgression; i++) {
            if (i != missProgression) {
                question += Integer.toString(progression[i]) + " ";
            } else {
                question += ".. ";
                roundQuestionAnswer[1] = Integer.toString(progression[i]);
            }
        }
        roundQuestionAnswer[0] = question;
        return roundQuestionAnswer;
    }
}
