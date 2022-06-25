package ru.otus.game;

public class TestDiceImplRange {

    private final DiceImpl  diceImplTest1 = new DiceImpl ();
    String scenario = "Тест попадания числа в диапазон 1-6";
    public void testDiceImpl() {
        try {
                int actual = diceImplTest1.roll();
                if ( actual > 0 && actual <= 6 )
                       System.out.printf("\"%s\" passed %n", scenario);
                else
                    throw new AssertionError("actual value " + actual + " beyond range 1-6");

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}