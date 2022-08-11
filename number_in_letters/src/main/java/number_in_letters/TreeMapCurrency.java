package number_in_letters;

public class TreeMapCurrency <K extends Long, V extends String> extends TreeMapImportedFromFile<Long, String>{

    private final String currencyFileName;

    public TreeMapCurrency (String currencyFileName){
        this.currencyFileName = currencyFileName;
        super.importFromFile(currencyFileName);

    }
}
