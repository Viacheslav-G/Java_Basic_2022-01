package ru.otus.game;

public class GameWinnerSaver implements GameWinnerPrinter  {
    public Player winnerOfGame;
    @Override
    public void printWinner(Player winner) {
          this.winnerOfGame = winner;
    }
}
