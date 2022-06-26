import java.util.ArrayList;

public class Quiz {


    private String subject;
    private ArrayList<Question> questionArrayList;
    private Question currentQuestion;
    private ArrayList<Question> scoreList;
    private Player player;


    public Quiz(String subject, ArrayList<Question> questionArrayList, Question currentQuestion, Player player) {
        this.subject = subject;
        this.questionArrayList = questionArrayList;
        this.currentQuestion = currentQuestion;
        this.player = player;
        this.scoreList = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
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

    public void addPointToScoreList(Question question){
        if(player.getAnswer() == currentQuestion.getCorrect()){
            scoreList.add(question);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void playQuiz(Question question){
        if(player.getAnswer() == currentQuestion.getCorrect()){
            scoreList.add(question);
            nextQuestion();
        } else if (player.getAnswer() != currentQuestion.getCorrect()) {
           nextQuestion();
        }
    }
}
