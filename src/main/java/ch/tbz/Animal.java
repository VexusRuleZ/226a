package ch.tbz;

import java.util.Scanner;

public class Animal {

    private final String question;
    private final String answer;
    private  int score = 0;
    public Animal(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public int quiz(Animal[] quiz) {
        Scanner s = new Scanner(System.in);
        for (Animal animal : quiz) {
            System.out.println(animal.question);
            String userInput = s.nextLine();
            if(userInput.equals(animal.answer)){
                score++;
            }
        }
        System.out.println("score is: " + score + "/" + quiz.length);
        return score;
    }
}
