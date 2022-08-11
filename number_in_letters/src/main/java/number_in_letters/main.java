package number_in_letters;

public class main {

    public static void main(String[] args) {

        InputNumber inputNumber = new InputNumberFromConsole();
        OutputResult outputResult = new OutputResultToConsole();

        CurrencyValue rub = new CurrencyValue(new Amount(inputNumber.input()), new TreeMapNumbers("numbers.txt") , new TreeMapCurrency("rub.txt"));
        outputResult.printResult(rub.getTextValue());

/*     if USD needed:
       CurrencyValue usd = new CurrencyValue(new Amount(inputNumber.input()), new TreeMapNumbers<>("numbers.txt"), new TreeMapCurrency<>("usd.txt"));
        outputResult.printResult(usd.getTextValue());*/

    }

}
