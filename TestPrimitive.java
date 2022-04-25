package ru.otus.java;

import java.util.Scanner;

public class TestPrimitive {

    static String greeting = "Hello, ";
    static  String intro = "! Let me ask you some questions about music. Are you ready?";

    public static void main(String[] args) {
        // write your code here

        System.out.println("Enter your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String message = greeting + name + intro;

        System.out.println(message);

        String[] questions;

        questions = new String[3];  //Вопросы: массив строк.

        questions[0] = "What is the name of the first Beatles album";
        questions[1] = "When did The Rolling Stones visit St Petersburg";
        questions[2] = "Who was the lead singer of The Beatles";


        String[][] answers = {   //Варианты ответов: двумерный массив строк (Вопрос * варианты ответов)
                {"With The Beatles","Please Please Me", "Yellow Submarine","Love Me Do" },
                {"2007","2006", "1998", "1979" },
                {"John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr", "All of them"}
        };

        int[] answersMatching = {2,1,5}; //матчинг (правильные ответы) - массив чисел
        int result = 0;
        //обход массива вариантов ответа
            for (int i = 0; i< answers.length; i++) {
                System.out.println(questions[i]);

                for (int j = 1; j<= answers[i].length; j++){

                    System.out.println(j + ". "+  answers[i][j-1]);

                }
                int a = scanner.nextInt();
                if (a == answersMatching[i]){
                    result++;
                    System.out.println("Yes, you are right!");
                }
                else System.out.println("No, you are wrong!");

            }

        System.out.println("Your final score is: right answers "+ result + ", wrong answers "+ (questions.length - result) );

    }
}
