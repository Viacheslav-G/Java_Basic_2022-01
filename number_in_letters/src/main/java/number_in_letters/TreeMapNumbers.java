package number_in_letters;

public class TreeMapNumbers<K extends Long, V extends String> extends TreeMapImportedFromFile<Long, String>{
   private final String numbersFileName;

   public TreeMapNumbers (String numbersFileName){
       this.numbersFileName = numbersFileName;
       super.importFromFile(numbersFileName);

    }

}
