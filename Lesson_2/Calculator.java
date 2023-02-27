public class Calculator {
    private char sign;

    public void setSign(char sign) {
        if ("+-*/%^".indexOf(sign) >= 0) {
            this.sign = sign;
        } else {
            System.out.println("Некорректный знак операции");
        }
    }

    public double calculate(double num1, double num2) {
        double result = 0;

        switch (sign) {
            case '+':
                result = num1 + num2;
            case '-':
                result = num1 - num2;
            case '*':
                result = num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Деление на ноль");
                } else {
                    result = num1 / num2;
                }
            case '%':
                result = num1 % num2;
            case '^':
                result = Math.pow(num1, num2);
            default:
                System.out.println("Некорректный знак операции");
        }

        return result;
    }
}