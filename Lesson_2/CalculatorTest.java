import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "yes";

        while (answer.equals("yes")) {
            double num1 = inputNumber(scanner, "Введите первое число: ");
            char sign = inputSign(scanner, "Введите знак математической операции: ");
            double num2 = inputNumber(scanner, "Введите второе число: ");

            calculator.setSign(sign);
            double result = calculator.calculate(num1, num2);
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);

            answer = typeMessage(scanner, "Хотите продолжить вычисления? [yes/no]: ");
            while (!answer.equals("yes") && !answer.equals("no")) {
                answer = typeMessage(scanner, "Некорректный ответ. Хотите продолжить " +
                        "вычисления? [yes/no]: ");
            }
        }
    }

    public static double inputNumber(Scanner scanner, String message) {
        double number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(message);
            try {
                number = scanner.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Некорректное значение. Попробуйте еще раз.");
                scanner.nextLine();
            }
        }

        return number;
    }

    public static char inputSign(Scanner scanner, String message) {
        char sign = ' ';
        boolean validInput = false;

        while (!validInput) {
            System.out.print(message);
            try {
                String input = scanner.next();
                sign = input.charAt(0);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Некорректный знак операции. Попробуйте еще раз.");
                scanner.nextLine();
            }
        }

        return sign;
    }

    public static String typeMessage(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.next();
    }
}
