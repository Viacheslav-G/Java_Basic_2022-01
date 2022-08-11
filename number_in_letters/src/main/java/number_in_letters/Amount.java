package number_in_letters;

public class Amount {
    private final long number;
    private final int length;
    private final long lastDigit;
    private final long lastTwoDigits;
    private final int triplesCount;  //how many triples (3-digit sequences) does number contain (1 - lowest value)
    private final StringBuilder reverse;

    public Amount(long number) {
        this.number = number;
        this.length = String.valueOf(number).length();
        this.lastDigit =  number % 10;
        this.lastTwoDigits =  number % 100;
        this.triplesCount = Math.ceilDiv(this.length,3);
        this.reverse = new StringBuilder(String.valueOf(this.number)).reverse();
    }

    public long getNumber() {
        return number;
    }


    public int getLength(){
        return length;
    }

    public long getLastDigit(){
        return lastDigit;
    }

    public long getLastTwoDigits(){
        return lastTwoDigits;
    }

    public long getDigitValue(int digitNumber){  //returns value of digit by its position number (1 - least significant digit) . returns -1  if value not exists

       try {
           return Integer.parseInt(String.valueOf(this.reverse.toString().charAt(digitNumber-1)));
       }
       catch (StringIndexOutOfBoundsException e){
           return -1;
       }
        //   return Integer.parseInt(""+String.valueOf(number).charAt(digitNumber));
    }


   public long getDigitDecimalValue(int digitNumber){

      if (getDigitValue(digitNumber) > 0  )
          return (long) (this.getDigitValue(digitNumber)*Math.pow(10, digitNumber-1));
      else
          return -1;

    }

    public int getTriplesCount() {   //how many triples (3-digit sequences) does number contain (1 - lowest value)
        return triplesCount;
    }

    public int getTripleValue(int triplePosition){  //returns value of triple (3-digit sequence) by its consecutive number (1 - lowest position)

        int startPosition = 3*(triplePosition-1);
        int endPosition =   3+3*(triplePosition-1) < this.length  ? 3+3*(triplePosition-1) : this.length ;

        StringBuilder stringResult = new StringBuilder(this.reverse.substring(startPosition ,endPosition));
        stringResult = stringResult.reverse();

        return Integer.parseInt(stringResult.toString());
    }

}
