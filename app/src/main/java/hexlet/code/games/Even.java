package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void runGame() {
        /*String answer;
        String correctAnswer;
        int questionNumber;
        Cli cli = new Cli();
        cli.greeting();
        Random rand = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            questionNumber = rand.nextInt(1000);
            System.out.println("Question: " + questionNumber);
            Scanner sc = new Scanner(System.in);
            answer = sc.next();
            if ((questionNumber % 2 == 0 && answer.equals("yes")) || (questionNumber % 2 == 1 && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")){
                    correctAnswer = "no";
                } else {
                    correctAnswer = "yes";
                }
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + correctAnswer
                        + "'.\nLet's try again, " + cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");*/
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random rand = new Random();
        int question;
        String answer;
        String[][] gameQuestionAnswer = new String [Engine.NUMBER_OF_ROUNDS][2];
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
