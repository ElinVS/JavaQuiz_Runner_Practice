import java.util.ArrayList;

public class Question {


    private String question;
    private String A;
    private String B;
    private String C;
    private String correct;

    public Question(String question,String a, String b, String c, String correct) {
        this.question = question;
        A = a;
        B = b;
        C = c;
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public String getC() {
        return C;
    }

    public String getCorrect() {
        return correct;
    }

}
