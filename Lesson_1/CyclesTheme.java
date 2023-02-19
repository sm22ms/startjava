public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        do {
            if(counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNums + 
                " , а нечетных = " + sumOddNums);

        System.out.println("\n3. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
           max = num3;
        }
        if (num1 < min) {
            min = num1;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.print(--max);
        for (int i = --max; i > min; i--) {
            System.out.print(", " + i);
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");
        int num4 = 1234;
        int sumDigits = 0;
        System.out.print("Reversed number: ");
        while (num4 > 0) {
            int lastDigit = num4 % 10;
            sumDigits += lastDigit;
            System.out.print(lastDigit);
            num4 /= 10;
        }
        System.out.println("\nSum of digits: " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int endOfRange = 24;
        int countNumPerLine = 0;
        // выписываем числа в полуинтервале [1,endOfRange) в каждой строке по 5 чисел
        for (int i = 1; i < endOfRange; i += 2) {
            System.out.printf("%2d ", i); 
            countNumPerLine++;
            if (countNumPerLine % 5 == 0) {
                System.out.println();
            }
        }
        // считаем сколько надо добавить нулей в последнюю строчку
        if (countNumPerLine % 5 > 0) {
            for (int i = countNumPerLine % 5; i < 5; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");
        int num6 = 10020200;
        int countTwos = 0;
        int copyNum6 = num6;
        //считаем кол-во двоек
        while (num6 != 0) {
            if (num6 % 10 == 2) {
                countTwos++;
            }
            num6 /= 10;
        }
        //определяем чет/нечет кол-ва двоек
        if(countTwos % 2 == 0) {
            System.out.println("Число " + copyNum6 + " содержит " + countTwos +
                    " четное количество двоек");
        } else {
            System.out.println("Число " + copyNum6 + " содержит " + countTwos +
                    " нечетное количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        System.out.println("Квадрат\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }

        System.out.println("\nПрямоугольный треугольник\n");
        int numOfRows1 = 5;
        int numOfColumns1 = 0;
        while(numOfColumns1 < numOfRows1) {
            int counterSymbolPerLine1 = numOfRows1 - numOfColumns1;
            while(counterSymbolPerLine1 > 0) {
                System.out.print('#');
                counterSymbolPerLine1--;
            }
            System.out.println();
            numOfColumns1++;
        }

        System.out.println("\nТреугольник №2\n");
        int numOfRows = 1;
        int counterSymbolPerLine = 1;
        do {
            int numOfColumns = 1;
            do {
                System.out.print("$");
                numOfColumns++;
            } while (numOfColumns <= counterSymbolPerLine);
            System.out.println();
            numOfRows++;
            if (numOfRows <= 3) {
                counterSymbolPerLine++;
            } else {
                counterSymbolPerLine--;
            }
        } while (numOfRows <= 5);

        System.out.println("\n7.Отображение ASCII-символов\n");
        System.out.printf("%4s %2s\n", "Dec", "Char");
        System.out.println("----------");
        for (int i = 0; i < 128; i++) {
            if (i % 2 != 0 && i < 48) {
                System.out.printf("%3d %4c\n", i, i);
            } 
            if (i % 2 == 0 && i >= 97) {
                System.out.printf("%3d %4c\n", i, i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом\n");
        long num8 = 123456787654321L;
        long reversedNum8 = 0;
        long cpoyNum8 = num8;
  
        // переворачиваем число
        while(num8 > 0) {
            long lastDigit = num8 % 10;
            reversedNum8 = reversedNum8 * 10 + lastDigit;
            num8  /= 10;
        }

        // проверяем, является ли число палиндромом
        if (cpoyNum8 == reversedNum8) {
            System.out.println(cpoyNum8 + " является палиндромом");
        } else {
            System.out.println(cpoyNum8 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        int num9 = 123456; // замените это число на любое другое шестизначное число
        int copyNum9 = num9;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        // вычисляем сумму первой половины num9
        for (int i = 0; i < 3; i++) {
            int digit = num9 % 10;
            sumFirstHalf += digit;
            num9 /= 10;
        }

        // вычисляем сумму второй половины num9
        for (int i = 0; i < 3; i++) {
            int digit = num9 % 10;
            sumSecondHalf += digit;
            num9 /= 10;
        }

        // проверяем, является ли число счастливым
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число является счастливым!");
        } else {
            System.out.println("Число не является счастливым.");
        }

        // выводим суммы половин числа в консоль
        System.out.println("Сумма цифр " + copyNum9 % 1000 + " = " + sumFirstHalf);
        System.out.println("Сумма цифр " + copyNum9 / 1000 + " = " + sumSecondHalf);

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");
        // Выводим заголовок таблицы c 2 до 9
        System.out.print("  | ");
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.print("--|");
        for (int i = 2; i <= 9; i++) {
            System.out.print("---");
        }
        System.out.println();
        
        // Выводим содержимое таблицы
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}