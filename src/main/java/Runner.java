import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ////

        Quiz quiz;
        Question question1;
        Question question2;
        ArrayList<Question> questions;
        ArrayList<Question> scoreList;
        Player player;

        questions = new ArrayList<>();

        question1 = new Question("What is a correct syntax to output \"Hello World\" in Java? : ", "A. Echo(\"Hello World\")", "B. print(\"Hello World\") ", "C. System.out println(\"Hello World\") ", "C");
        question2 = new Question("How do you insert COMMENTS in Java code? : ", " A. #This is a comment", "B. //This is a comment", "C. /*This is a comment", "B");
        questions.add(question1);
        questions.add(question2);

        scoreList = new ArrayList<>();

        player = new Player("Bob", "C");

        quiz = new Quiz("Java", questions, questions.get(0), player);

        ////

        System.out.println("Hello player. What is your name? ");
        String name = in.nextLine();
        player.setName(name);

        System.out.println("Hello " + player.getName() + "! This is a quiz about " + quiz.getSubject() + ". You will get a question with 3 options. Simply select the option you think is correct, A,B or C. Lets see how good you are at " + quiz.getSubject() + "! Are you ready for the first question? Yes or No?");
        String answer = in.nextLine();
        if (Objects.equals(answer.toLowerCase(), "yes")) {
            System.out.println("Great!" + quiz.getCurrentQuestion().getQuestion() + quiz.getCurrentQuestion().getA() + quiz.getCurrentQuestion().getB() + quiz.getCurrentQuestion().getC());
            String choice = in.nextLine();
            if (choice.toUpperCase().equals(quiz.getCurrentQuestion().getCorrect())){
                scoreList.add(question1);
//                in.nextLine();
                System.out.println("Interesting choice! Lets move on to your next question " + quiz.nextQuestion() + quiz.getCurrentQuestion().getQuestion() + quiz.getCurrentQuestion().getA() + quiz.getCurrentQuestion().getB() + quiz.getCurrentQuestion().getC() );
            }
        }
    }

}

//
//     if(player.getAnswer() == currentQuestion.getCorrect()){
//             scoreList.add(question);
//             nextQuestion();
//             } else if (player.getAnswer() != currentQuestion.getCorrect()) {
//             nextQuestion();
//             }