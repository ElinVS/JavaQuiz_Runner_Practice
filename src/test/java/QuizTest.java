import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QuizTest {

    Quiz quiz;
    Question question1;
    Question question2;
    ArrayList<Question> questions;
    ArrayList<Question> scoreList;
    Player player;



    @Before
    public void before(){

        questions = new ArrayList<>();

        question1 = new Question("What is a correct syntax to output \"Hello World\" in Java?", "A. Echo(\"Hello World\")", "B. print(\"Hello World\") ", "C. System.out println(\"Hello World\") ", "C" );
        question2 = new Question("How do you insert COMMENTS in Java code?", "A. #This is a comment", "A. //This is a comment", "A. /*This is a comment", "A" );
        questions.add(question1);
        questions.add(question2);

        scoreList = new ArrayList<>();

        player = new Player("Bob", "C");

        quiz = new Quiz("Java", questions,questions.get(0), player);
    }


    @Test
    public void hasAListOfQuestions(){
        assertEquals(2, quiz.getQuestionArrayListCount());
    }

    @Test
    public void canAddQuestionToQuiz(){
        quiz.addQuestion(question1);
        assertEquals(3, quiz.getQuestionArrayListCount());
    }

    @Test
    public void hasACurrentQuestion(){
        assertEquals(question1, quiz.getCurrentQuestion());
    }

    @Test
    public void canMoveToNextQuestion(){
        quiz.nextQuestion();
        assertEquals(question2, quiz.getCurrentQuestion());
    }

    @Test
    public void scoreListStartsEmpty(){
        assertEquals(0, quiz.getScoreList());
    }

    @Test
    public void playerCanScorePoints(){
        player.getAnswer();
        quiz.addPointToScoreList(questions.get(0));
        assertEquals("C", player.getAnswer());
        assertEquals(1, quiz.getScoreList());
    }

    @Test
    public void playQuiz(){
        quiz.playQuiz(questions.get(0));
        assertEquals(1, quiz.getScoreList());
        assertEquals(question2, quiz.getCurrentQuestion());
    }

}
