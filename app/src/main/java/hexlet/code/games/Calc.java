package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void runGame() {
        String rules = "What is the result of the expression?";
        Random rand = new Random();
        int numberQuestion1;
        int numberQuestion2;
        int numberMathOperation;
        String question = "";
        int answer = 0;
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][Engine.COUNT_OF_ANSWER];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            numberQuestion1 = rand.nextInt(20);
            numberQuestion2 = rand.nextInt(20);
            numberMathOperation = rand.nextInt(3);
            switch (numberMathOperation) {
                case 0:
                    question = Integer.toString(numberQuestion1) + " + " + Integer.toString(numberQuestion2);
                    answer = numberQuestion1 + numberQuestion2;
                    break;
                case 1:
                    question = Integer.toString(numberQuestion1) + " - " + Integer.toString(numberQuestion2);
                    answer = numberQuestion1 - numberQuestion2;
                    break;
                case 2:
                    question = Integer.toString(numberQuestion1) + " * " + Integer.toString(numberQuestion2);
                    answer = numberQuestion1 * numberQuestion2;
                    break;
                default:
                    break;
            }
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = question;
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = Integer.toString(answer);
        }
        Engine.runGame(rules, gameQuestionAnswer);
    }
}
