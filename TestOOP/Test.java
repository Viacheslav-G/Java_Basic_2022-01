package TestOOP;

import java.util.*;

public class Test {

    private Question[] questions;
    private Result result ;

    public Test(Question[] questions, Result result){
        this.questions = questions;
        this.result = result;
    }



   public void doTest(){

       int a = 0;
       Scanner scanner = new Scanner(System.in);
       for (int i = 0; i < questions.length; i++) {
           questions[i].printQuestion();
           questions[i].printAnswers();

             do {
                 if  (scanner.hasNextInt() ) {
                     a = scanner.nextInt();
                     if (a < 1 || a > questions[i].getNumOfAnswers()) {
                         System.out.println("Incorrect input 1");
                         continue;
                     }
                 }
                 else {
                     System.out.println("Incorrect input 2");
                     scanner.next();
                 }

                }
             while  ( a<1 || a > questions[i].getNumOfAnswers() );

               if (questions[i].checkAnswerIfCorrect(a)) {
                   System.out.println("Yes, you are right!");
                   this.result.addScore();
               }
               else {
                   System.out.println("No, you are wrong!");
               }
       }

       this.result.printResult();

   }

}

