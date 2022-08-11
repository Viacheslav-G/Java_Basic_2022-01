package number_in_letters;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class ImportValuesFromFileToTreeMap {
  private final String fileName;

    public ImportValuesFromFileToTreeMap(String fileName) {
        this.fileName = fileName;
    }

    public TreeMap<Long, String> createValuesTreeMap(){
        TreeMap <Long, String> valuesTextMap = new TreeMap<Long, String>() ;
        try(
                FileReader fileValues = new FileReader(this.fileName);
                Scanner scanFileValues = new Scanner(fileValues))
        {
            while (scanFileValues.hasNextLine()){
                Long number = Long.parseLong(scanFileValues.next());
                String letterNumber = scanFileValues.nextLine().trim();
                valuesTextMap.put(number, letterNumber);

            }
        }
        catch (IOException e)
        {
            System.out.println("File "+fileName+  " not found. Please check");
            System.exit(53);

        }

        return valuesTextMap;
    }

}
