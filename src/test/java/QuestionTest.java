import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTest {

    Question question1;
    Question question2;

    Question question3;
    Question question4;

    Question question5;
    Question question6;

    Question question7;
    Question question8;

    Question question9;
    Question question10;

    @Before
    public void before(){
        question1 = new Question("What is a correct syntax to output \"Hello World\" in Java?", "A. Echo(\"Hello World\")", "B. print(\"Hello World\") ", "C. System.out println(\"Hello World\") ", "C" );
        question2 = new Question("How do you insert COMMENTS in Java code?", "A. #This is a comment", "A. //This is a comment", "A. /*This is a comment", "A" );
//        question3 = new Question("");
//        question4 = new Question("");
//        question5 = new Question("");
//        question6 = new Question("");
//        question7 = new Question("");
//        question8 = new Question("");
//        question9 = new Question("");
//        question10 = new Question("");
    }

    @Test
    public void hasAQuestion(){
        assertEquals();

    }

    @Test
    public void hasAnAnswer(){

    }

    @Test
    public void hasOptionA(){

    }

    @Test
    public void hasOptionB(){

    }

    @Test
    public void hasOptionC(){

    }

    @Test
    public void hasCorrectAnswer(){

    }


}
