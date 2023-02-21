public class Calculator {
    public double calculate(double num1, double num2, char sign) {
        double result;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = 1;
                result = Math.pow(num1, num2);
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                throw new IllegalArgumentException("Некорректный знак операции");
        }
        return result;
    }
}
