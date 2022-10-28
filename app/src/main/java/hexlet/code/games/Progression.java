package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void runGame() {
        String rules = "What number is missing in the progression?";
        Random rand = new Random();
        int numberProgression1;
        int dProgression;
        int countProgression;
        int missProgression;
        String question = "";
        int answer = 0;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = "";
            numberProgression1 = rand.nextInt(10);
            dProgression = rand.nextInt(1, 7);
            countProgression = rand.nextInt(5, 10);
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
        Engine.runGame(rules, gameQuestionAnswer);
    }
}
