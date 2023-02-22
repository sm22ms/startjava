import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        while (answer.equals("yes")) {
            double num1 = promptForDouble(scanner, "Введите первое число: ");
            char sign = ' ';

            // Ввод знака операции
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Введите знак математической операции: ");
                try {
                    String input = scanner.next();
                    sign = input.charAt(0);
                    if ("+-*/%^".indexOf(sign) >= 0) {
                        validInput = true;
                    } else {
                        System.out.println("Некорректный знак операции. Попробуйте еще раз.");
                    }
                } catch (Exception e) {
                    System.out.println("Некорректный знак операции. Попробуйте еще раз.");
                    scanner.nextLine();
                }
            }

            double num2 = promptForDouble(scanner, "Введите второе число: ");

            double result = calculator.calculate(num1, num2, sign);
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            }
        }
    }

    // Метод для вывода первого и второго числа
    public static double promptForDouble(Scanner scanner, String message) {
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
}
