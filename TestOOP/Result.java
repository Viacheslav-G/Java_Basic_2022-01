package TestOOP;

public class Result {
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }
    public void printResult(){
        System.out.println("Your final score is: " + this.score + " right answers ");
    }

}
