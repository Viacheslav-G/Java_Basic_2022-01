package ru.otus.game;
import ru.otus.assertions.Assertions;
public class TestGameFirst1Second6 {

    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public TestGameFirst1Second6(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        String scenario = "Òest Player 1 = 1; Player 2 = 6; Expected Winner = Player 1" ;
        int player1Result = new DiceImplStubReturns1().roll();
        int player2Result = new DiceImplStubReturns6().roll();

        Player winner = (player1Result > player2Result)? player1: player2;

        try{
            Assertions.assertEquals(winner.getName(), player2.getName());
            System.out.printf("\"%s\" passed %n", scenario);
             }
         catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }



}
