package numbers_in_letters;

import number_in_letters.*;
import org.junit.Assert;

public class test {

    public static void main(String[] args)

    {
        InputNumber inputNumber = new InputNumberFromConsoleStub45();
        CurrencyValue testRub = new CurrencyValue(new Amount(inputNumber.input()), new TreeMapNumbers("numbers.txt"), new TreeMapCurrency("rub.txt"));

        Assert.assertEquals("����� ���� ������", testRub.getTextValue());
    }

}
