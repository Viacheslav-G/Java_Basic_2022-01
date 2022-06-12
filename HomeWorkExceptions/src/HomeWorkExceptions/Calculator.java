package HomeWorkExceptions;

public class Calculator {

    protected int firstNum;
    protected int secondNum;

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setFirstNum(String firstNum) {
        try {
            this.firstNum = Integer.parseInt(firstNum);
        }
        catch (NumberFormatException e)
        {
            //rethrow
            throw new RuntimeException("Incorrect format of the first number: not an integer value", e);
        }
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setSecondNum(String secondNum) {
        try {
                this.secondNum = Integer.parseInt(secondNum);
        }
        catch (NumberFormatException e){
            //rethrow
            throw new RuntimeException("Incorrect format of the second number:  not an integer value", e);
        }
    }

    public int sum(){

        int result = firstNum + secondNum ;
        return result;
    }

    public float divide(){

        if(secondNum == 0)
            throw new RuntimeException( "Division by zero");

        float result = (float) firstNum/(float) secondNum;
        return result;
    }

}
