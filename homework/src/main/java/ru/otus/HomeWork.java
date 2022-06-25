package ru.otus;


import ru.otus.game.*;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {

       new TestDiceImplRange().testDiceImpl();

        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        TestGameFirst1Second6 testGameFirst1Second6 = new TestGameFirst1Second6(dice, winnerPrinter);
        testGameFirst1Second6.playGame(new Player("TestPlayer1"), new Player("TestPlayer2"));

        String scenario = "Test: both players have six, Expected nobody wins" ;
        Dice testDiceSix = new DiceImplStubReturns6();
        GameWinnerSaver winnerSaver = new GameWinnerSaver();
        Game testGameBothSix = new Game(testDiceSix, winnerSaver );
        Player testBothSixPlayer1 = new Player("TestBothSixPlayer1");
        Player testBothSixPlayer2 = new Player("TestBothSixPlayer2");
        try {
            testGameBothSix.playGame(testBothSixPlayer1, testBothSixPlayer2 );
            if(winnerSaver.winnerOfGame.equals(testBothSixPlayer1))
                throw new AssertionError("Expected no winner, actual winner: " + testBothSixPlayer1.getName());
            if(winnerSaver.winnerOfGame.equals(testBothSixPlayer2))
                throw new AssertionError("Expected no winner, actual winner: " + testBothSixPlayer2.getName());
            System.out.printf("\"%s\" passed %n", scenario);
        }
        catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

        scenario = "Test: player 2 cannot win if gets one as a result" ;
        TestGameSecond1 testGameSecond1 = new TestGameSecond1(dice, winnerSaver );
        Player testSecond1Player1 = new Player("TestSecond1Player1");
        Player testSecond1Player2 = new Player("TestSecond1Player2");
        try {
               testGameSecond1.playGame(testSecond1Player1, testSecond1Player2);
               if(winnerSaver.winnerOfGame.equals(testSecond1Player2))
                     throw new AssertionError("Expected: Player 2 cannot win with result = 1, but in fact he wins");
            System.out.printf("\"%s\" passed %n", scenario);
        }

        catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
    
}