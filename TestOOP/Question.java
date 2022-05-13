package TestOOP;

public class Question {
    private String questionText;
    private Answer[] answers;


public Question(String questionText, Answer[] answers){
    this.questionText = questionText;
    this.answers = answers;

}

    public void printQuestion() {
        System.out.println(this.questionText);
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void printAnswers() {
        for (int i = 0; i < answers.length; i++) {

            System.out.println( (i+1) +"."+this.answers[i].answerText);
        }
    }

    public boolean checkAnswerIfCorrect(int i){

       if (this.answers[i-1].isCorrect == true)
           return true;
       else return false;
    }

    public int getNumOfAnswers(){
       return answers.length;
    }

}
