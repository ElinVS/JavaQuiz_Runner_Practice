import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questionArrayList;
    private Question currentQuestion;
    private ArrayList<Question> scoreList;


    public Quiz(ArrayList<Question> questionArrayList, Question currentQuestion) {
        this.questionArrayList = questionArrayList;
        this.currentQuestion = currentQuestion;
        this.scoreList = new ArrayList<>();
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Question currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public int getQuestionArrayListCount() {
        return questionArrayList.size();
    }

    public void setQuestionArrayList(ArrayList<Question> questionArrayList) {
        this.questionArrayList = questionArrayList;
    }

    public void addQuestion(Question question) {
        questionArrayList.add(question);
    }

    public void nextQuestion() {
        int index = questionArrayList.indexOf(getCurrentQuestion());
        int next = index + 1;
        Question nextQuestion = questionArrayList.get(next);
        setCurrentQuestion(nextQuestion);
    }

    public int getScoreList() {
        return scoreList.size();
    }

    public void setScoreList(ArrayList<Question> scoreList) {
        this.scoreList = scoreList;
    }
}
