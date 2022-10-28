package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void runGame() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random rand = new Random();
        int question;
        String answer;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = rand.nextInt(1000);
            if (question % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = Integer.toString(question);
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = answer;
        }
        Engine.runGame(rules, gameQuestionAnswer);
    }
}
