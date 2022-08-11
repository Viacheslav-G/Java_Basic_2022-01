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
                System.out.println("������������ ������ �����! ������� ����� �����");
            }
        }
        while (true);

        return firstLong;
    }

}
