package HomeWorkExceptions;

import java.util.*;
import java.io.*;

public class Calculations {


    public static String readFirstLineFromFile2()
            throws IOException {
        try (FileReader f = new FileReader("a.txt");
             BufferedReader br = new BufferedReader(f))
        {
            return br.readLine();
        }
    }


    public static void main(String[] args) throws Exception {

        CalculatorConsole calculatorConsole = new CalculatorConsole();

        calculatorConsole.setFirstNum();
        calculatorConsole.setSecondNum();

        System.out.println(calculatorConsole.sum());
        System.out.println(calculatorConsole.divide());

        CalculatorFile calculatorFile = new CalculatorFile();
        calculatorFile.readTwoNumberFromFile();

        System.out.println(calculatorFile.sum());
        System.out.println(calculatorFile.divide());

    }
}
