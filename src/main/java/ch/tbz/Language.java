package ch.tbz;

import java.util.Scanner;

public class Language {
    private final String question;
    private final String answer;
    private  int score = 0;
    public Language(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public int quiz(Language[] quiz) {
        Scanner s = new Scanner(System.in);
        for (Language language : quiz) {
            System.out.println(language.question);
            String userInput = s.nextLine();
            if(userInput.equals(language.answer)){
                score++;
            }
        }
        System.out.println("score is: " + score + "/" + quiz.length);

        return score;
    }
}
