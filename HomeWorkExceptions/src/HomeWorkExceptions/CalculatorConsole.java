package HomeWorkExceptions;

import java.util.Scanner;

public class CalculatorConsole extends Calculator{

    public void setFirstNum() {
//        int firstInt = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            String firstLine = scanner.nextLine();
            try {  //повторный ввод
                int firstInt = Integer.parseInt(firstLine);
                super.setFirstNum(firstInt);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect format of the first number! Please input an integer value");
            }

        }
    while (true);
    }

    public void setSecondNum() {
//        int secondInt = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            String secondLine = scanner.nextLine();
            try {  //повторный ввод
                int secondInt = Integer.parseInt(secondLine);
                super.setSecondNum(secondInt);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect format of the second number! Please input an integer value");
            }

        }
        while (true);
    }



}







