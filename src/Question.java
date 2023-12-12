import java.util.Scanner;

public class Question {
    Scanner sc = new Scanner(System.in);

    //FIELDS
    String questionText;
    String answerText;

    //CONSTRUCTOR
    public Question(String questionText, String answerText){
        this.questionText = questionText;
        this.answerText = answerText;
    }

    //METHODS
    public int processAnswer(String userAnswer){
        if (userAnswer.equals(answerText)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
