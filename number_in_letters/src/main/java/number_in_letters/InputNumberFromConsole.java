package number_in_letters;

import java.util.Scanner;

public class InputNumberFromConsole implements InputNumber {

    @Override
    public long input() {
        Scanner scanner = new Scanner(System.in);
        long firstLong;
        do {
            String firstLine = scanner.nextLine();
            try {
                firstLong = Long.parseLong(firstLine);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный формат ввода! Введите целое число");
            }
        }
        while (true);

        return firstLong;
    }

}
