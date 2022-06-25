package ru.otus.game;
import ru.otus.assertions.Assertions;

public class TestGameSecond1 {

    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public TestGameSecond1(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
       // String scenario = "Òest Player 1 = 1; Player 2 = 6; Expected Winner = Player 1" ;
        int player1Result = dice.roll();
       // System.out.println(player1Result);
        int player2Result = new DiceImplStubReturns1().roll();
        //System.out.println(player2Result);
        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
    }



}
