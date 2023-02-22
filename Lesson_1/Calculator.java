public class Calculator {
    public static void main(String[] args) {
        long num1 = 1423L;
        long num2 = 17;
        char sign = '^'; // здесь можно задать нужный знак операции
        long result;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Некорректный знак операции");
            return;
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
