package ch.tbz;

import java.util.Scanner;

public class Switzerland {
    final private String question;
    private final String answer;
    private int score = 0;

    public Switzerland(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public int quiz(Switzerland[] quiz) {
        Scanner s = new Scanner(System.in);
        for (Switzerland switzerland : quiz) {
            System.out.println(switzerland.question);
            String userInput = s.nextLine();
            if (userInput.equals(switzerland.answer)) {
                score++;
            }
        }
        System.out.println("score is: " + score + "/" + quiz.length);

        return score;
    }
}
