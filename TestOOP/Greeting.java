package TestOOP;

import java.util.Scanner;

public class Greeting {
    private String greetingFirstPart;
    private String greetingLastPart;
    private String name;

    public  Greeting(String greetingFirstPart, String greetingLastPart )  {
      this.greetingFirstPart = greetingFirstPart;
      this.greetingLastPart = greetingLastPart;
    }

    public void setName() {

        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    public void printGreeting(){

        if (this.name == null)
           this.setName();

        String message = this.greetingFirstPart + this.name + this.greetingLastPart ;
        System.out.println(message) ;

    }

    public static void main(String[] args) {

        Greeting greeting1 = new Greeting("Hello, ", "! Let me ask you some questions about music. Are you ready?");
        greeting1.setName();

        greeting1.printGreeting();

     //   Question question1 = new Question("What is the name of the first Beatles album",   );

     //   Question question1 = new Question("", new Answer[1] answer1Question1 (question1, "With The Beatles", false)

        Answer[] answersQ1 = { new Answer("With The Beatles", false ),
                new Answer("Please Please Me", true),
                new Answer("Yellow Submarine", false),
                new Answer("Love Me Do", false),
        };

        Answer[] answersQ2 = { new Answer("2007", true ),
                new Answer("2006", false),
                new Answer("1998", false),
                new Answer("1979", false),
        };

        Answer[] answersQ3 = { new Answer("John Lennon", false ),
                new Answer("Paul McCartney", false),
                new Answer("George Harrison", false),
                new Answer("Ringo Starr", false),
                new Answer("All of them", true),

        };


        Question[] questions = {new Question("What is the name of the first Beatles album", answersQ1),
                                new Question("When did The Rolling Stones visit St Petersburg", answersQ2),
                                new Question("Who was the lead singer of The Beatles", answersQ3),
        };

        Result result = new Result();
        Test test1 = new Test(questions, result);
        test1.doTest();


    }



}
