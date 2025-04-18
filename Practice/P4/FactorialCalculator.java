package P4;
import java.util.*;


public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int number = -1;

        while (true) {
            System.out.print("Enter an integer between 0 to 16: ");
            input = scanner.nextLine();

            try {
                // 소수인지 먼저 확인
                if (input.contains(".")) {
                    Double.parseDouble(input);
                    System.out.println(input + " is a floating-point number. Try again.");
                    continue;
                }

                // 정수로 변환 시도
                number = Integer.parseInt(input);

                // 음수인지 확인
                if (number < 0) {
                    System.out.println(number + " is a negative integer. Try again.");
                }
                // 16보다 큰지 확인
                else if (number > 16) {
                    System.out.println(number + " is an integer greater than 16. Try again.");
                }
                // 올바른 값일 때 반복문 탈출
                else {
                    break;
                }

            } catch (NumberFormatException e) {
                // 숫자가 아닐 때
                System.out.println(input + " is a string. Try again.");
            }
        }

        // 팩토리얼 계산
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " = " + factorial);
        scanner.close();
    }
}

