import java.util.Scanner;

public class Quiz {

    Scanner sc = new Scanner(System.in);
    public static Question[] questions = new Question[3];
    public static int points = 0;

    public Quiz(){
        questions[0] = new Question("Who was the first computer programmer in history?", "Ada Lovelace");
        questions[1] = new Question("What is the capital city of Canada?", "Ottawa");
        questions[2] = new Question("Which planet is known as the Red Planet?", "Mars");
    }



    public void start() {
        for (int i = 0; i < questions.length; i++) {
            ask(questions[i]);
        }
        outputResults();
    }

    public void ask(Question question){
        System.out.println(question.questionText);
        String answer = sc.nextLine();
        if (question.processAnswer(answer) == 1){
            points++;
        }
        else{
            System.out.println("Incorrect");
            System.out.println("Corect answer: " + question.answerText);
        }

    }

    public void outputResults(){
        System.out.println("Total points: " + points);
        System.out.println("Goodbye!");
    }




}