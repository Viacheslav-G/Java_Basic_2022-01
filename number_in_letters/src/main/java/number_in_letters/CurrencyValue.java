package number_in_letters;

public class CurrencyValue {
    private Amount amount;
    private TreeMapNumbers<Long, String> treeMapNumbers;
    private TreeMapCurrency<Long, String> treeMapCurrency;
    private StringBuilder amountText;
    private String currencySuffix;



    public CurrencyValue(Amount amount, TreeMapNumbers<Long, String> treeMapNumbers, TreeMapCurrency<Long, String> treeMapCurrency) {
        this.amount = amount;
        this.treeMapNumbers = treeMapNumbers;
        this.treeMapCurrency = treeMapCurrency;

        this.currencySuffix =  amount.getDigitValue(2) ==1 ? treeMapCurrency.floorEntry(amount.getLastTwoDigits()).getValue() : treeMapCurrency.floorEntry(amount.getLastDigit()).getValue();
        this.amountText = new StringBuilder();
    }

    public Amount getAmount() {
        return amount;
    }

    public String getCurrencySuffix(){
        return currencySuffix;
    }

    public String getLastTripleSuffix(){

           if (amount.getTripleValue(1) > 0) {
            return  "";
           }
           else return "";

    }

    public String getAmountText(){
        if (treeMapNumbers.containsKey(amount.getNumber())){
            amountText.append(treeMapNumbers.get(amount.getNumber())+" ");
        }
        else{
            for (int t = amount.getTriplesCount(); t>0; t--) {
                Amount amountTriple = new Amount(amount.getTripleValue(t));

                StringBuilder tripleSuffix = new StringBuilder();
                boolean suffixIsSet = false;

                for (int i = 3; i >= 1; i--) {
                    if (amountTriple.getDigitValue(i) > 0) {
                        if (i == 2 && amountTriple.getDigitValue(i) == 1) {
                            amountText.append(treeMapNumbers.get(amountTriple.getLastTwoDigits()) + " ");
                            break;
                        } else
                        if (
                                (i == 1) && (t > 1)
                                        && (treeMapNumbers.containsKey((long)(amountTriple.getLastDigit() * Math.pow(10, 3 * (t - 1)))))
                        )
                        {
                            amountText.append(treeMapNumbers.floorEntry((long) (amountTriple.getLastDigit() * Math.pow(10, 3 * (t - 1)))).getValue()+" ");
                            suffixIsSet = true;
                        }
                        else
                            amountText.append(treeMapNumbers.floorEntry(amountTriple.getDigitDecimalValue(i)).getValue() + " ");
                    } else
                        continue;
                }
                if (t>1 && amountTriple.getNumber() > 0 ) {
                    if  (amountTriple.getLastTwoDigits() > 0 && amountTriple.getDigitValue(2)==1 ) {
                        tripleSuffix.append(treeMapNumbers.floorEntry((long) (amountTriple.getLastTwoDigits() * Math.pow(10, 3 * (t - 1)))).getValue());

                    } else if (amountTriple.getLastDigit() > 0 )
                        tripleSuffix.append(treeMapNumbers.floorEntry((long) (amountTriple.getLastDigit() * Math.pow(10, 3 * (t - 1)))).getValue());
                    else {
                        tripleSuffix.append(treeMapNumbers.floorEntry((long) (amountTriple.getNumber() * Math.pow(10, 3 * (t - 1)))).getValue());

                    }
                    if (suffixIsSet == false)
                        amountText.append(tripleSuffix.substring(tripleSuffix.lastIndexOf(" ")+1)+ " ");
                }
            }



            }
        return amountText.toString();
    }

    public String getTextValue() {
        return this.getAmountText()  + this.getCurrencySuffix();
    }


}
