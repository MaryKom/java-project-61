package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static final String RULES = "What is the result of the expression?";
    public static final int MAX_NUMBER = 20;
    public static final int COUNT_OPERATION = 3;
    public static void runGame() {
        Random rand = new Random();
        int numberQuestion1;
        int numberQuestion2;
        int numberMathOperation;
        String question = "";
        int answer = 0;
        String strMathOperation = "";
        String[][] gameQuestionAnswer = new String[Engine.NUMBER_OF_ROUNDS][Engine.COUNT_OF_ANSWER];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            numberQuestion1 = rand.nextInt(MAX_NUMBER);
            numberQuestion2 = rand.nextInt(MAX_NUMBER);
            numberMathOperation = rand.nextInt(COUNT_OPERATION);
            switch (numberMathOperation) {
                case 0:
                    strMathOperation = " + ";
                    answer = numberQuestion1 + numberQuestion2;
                    break;
                case 1:
                    strMathOperation = " - ";
                    answer = numberQuestion1 - numberQuestion2;
                    break;
                case 2:
                    strMathOperation = " * ";
                    answer = numberQuestion1 * numberQuestion2;
                    break;
                default:
                    break;
            }
            question = Integer.toString(numberQuestion1) + strMathOperation + Integer.toString(numberQuestion2);
            gameQuestionAnswer[i][Engine.NUMBER_OF_QUESTION] = question;
            gameQuestionAnswer[i][Engine.NUMBER_OF_ANSWER] = Integer.toString(answer);
        }
        Engine.runGame(RULES, gameQuestionAnswer);
    }
}
