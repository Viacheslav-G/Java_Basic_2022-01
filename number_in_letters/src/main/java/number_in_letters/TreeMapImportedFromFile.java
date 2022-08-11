package number_in_letters;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapImportedFromFile<K extends Long, V extends String > extends TreeMap<K, V>{

    public void importFromFile(String sourceFileName ){

        try(
                FileReader fileValues = new FileReader(sourceFileName);
                Scanner scanFileValues = new Scanner(fileValues))
        {
            while (scanFileValues.hasNextLine()){
                Long number = Long.parseLong(scanFileValues.next());
                String letterNumber = scanFileValues.nextLine().trim();
                super.put((K) number, (V) letterNumber);

            }
        }
        catch (IOException e)
        {
            System.out.println("File "+sourceFileName +  " not found. Please check");
            System.exit(53);

        }



    }


}

