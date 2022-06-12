package HomeWorkExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculatorFile extends Calculator {
    public void readTwoNumberFromFile(){
        try (FileReader f = new FileReader("a.txt");
            BufferedReader br = new BufferedReader(f))
        {
            super.setFirstNum(br.readLine());
            super.setSecondNum(br.readLine());
        }

        catch (IOException e) //вывод ошибки
        {
            System.out.println("File a.txt not found. Please check");
            System.exit(53);

        }

    }

}
