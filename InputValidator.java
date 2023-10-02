import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    public static int validateInput(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int input = scanner.nextInt();
                scanner.nextLine(); // 清除输入缓冲区中的换行符

                if (input < min || input > max) {
                    System.out.printf("Please enter a number between %d and %d: ", min, max);
                    continue;
                }

                return input;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.nextLine();// 清除输入缓冲区中的无效输入
            }
        }
    }
}
