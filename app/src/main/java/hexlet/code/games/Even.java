package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 1000;
    public static void runGame() {
        Random rand = new Random();
        int question;
        String answer;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][Engine.COUNT_OF_ANSWER];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = rand.nextInt(MAX_NUMBER);
            if (question % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = Integer.toString(question);
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = answer;
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }
}
