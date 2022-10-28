package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int FIRST_NUMBER_PROGRESSION_MAX = 10;
    private static final int D_PROGRESSION_MIN = 1;
    private static final int D_PROGRESSION_MAX = 7;
    private static final int COUNT_PROGRESSION_MIN = 5;
    private static final int COUNT_PROGRESSION_MAX = 10;
    private static int numberProgression1;
    private static int dProgression;
    private static int countProgression;
    private static int missProgression;
    public static void runGame() {
        Random rand = new Random();
        String question = "";
        int answer = 0;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][Engine.COUNT_OF_ANSWER];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = "";
            numberProgression1 = rand.nextInt(FIRST_NUMBER_PROGRESSION_MAX);
            dProgression = rand.nextInt(D_PROGRESSION_MIN, D_PROGRESSION_MAX);
            countProgression = rand.nextInt(COUNT_PROGRESSION_MIN, COUNT_PROGRESSION_MAX);
            missProgression = rand.nextInt(countProgression);
            for (int j = 0; j < countProgression; j++) {
                if (j != missProgression) {
                    question += Integer.toString(numberProgression1 + dProgression * j) + " ";
                } else {
                    question += ".. ";
                    answer = numberProgression1 + dProgression * j;
                }
            }
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = question;
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = Integer.toString(answer);
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }
}
