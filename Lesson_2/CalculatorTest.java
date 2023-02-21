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
            double num1 = 0;
            double num2 = 0;
            char sign = ' ';

            // Ввод первого числа
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Введите первое число: ");
                try {
                    num1 = scanner.nextDouble();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Некорректное значение. Попробуйте еще раз.");
                    scanner.nextLine();
                }
            }

            // Ввод знака операции
            validInput = false;
            while (!validInput) {
                System.out.print("Введите знак математической операции: ");
                try {
                    String input = scanner.next();
                    if (input.length() == 1) {
                        sign = input.charAt(0);
                        if ("+-*/%^".indexOf(sign) >= 0) {
                            validInput = true;
                        } else {
                            System.out.println("Некорректный знак операции. Попробуйте еще раз.");
                        }
                    } else {
                        System.out.println("Некорректный знак операции. Попробуйте еще раз.");
                    }
                } catch (Exception e) {
                    System.out.println("Некорректный знак операции. Попробуйте еще раз.");
                    scanner.nextLine();
                }
            }

            // Ввод второго числа
            validInput = false;
            while (!validInput) {
                System.out.print("Введите второе число: ");
                try {
                    num2 = scanner.nextDouble();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Некорректное значение. Попробуйте еще раз.");
                    scanner.nextLine();
                }
            }

            double result;
            try {
                result = calculator.calculate(num1, num2, sign);
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            }
        }
    }
}
