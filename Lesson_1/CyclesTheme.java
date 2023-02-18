public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int count = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if(count % 2 == 0) {
                sumEvenNum += count;
            } else {
                sumOddNum += count;
            }
            count++;
        } while(count <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + 
                " , а нечетных = " + sumOddNum);

        System.out.println("\n3. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = -5;
        int num2 = 10;
        int num3 = 0;
        int max;
        int min;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }

        System.out.print(--max);
        for (int i = --max; i > min; i--) {
            System.out.print(", " + i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int num4 = 1234;
        int sumNum4 = 0;
        int reversedNum4 = 0;
        while (num4 > 0) {
            int lastDigit = num4 % 10;
            sumNum4 += lastDigit;
            reversedNum4 = (reversedNum4 * 10) + lastDigit;
            num4 /= 10;
        }

        System.out.println("Reversed number: " + reversedNum4);
        System.out.println("Sum of digits: " + sumNum4);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int num5 = 24;
        int countNumPerLine = 0;
        // выписываем числа в полуинтервале [1,num5) в каждой строке по 5 чисел
        for (int i = 1; i < num5; i += 2) {
            System.out.printf("%2d ", i); 
            countNumPerLine++;
            if (countNumPerLine % 5 == 0) {
                System.out.println();
            }
        }
        // считаем сколько надо добавить нулей в последнюю строчку
        if (countNumPerLine % 5 != 0) {
            for (int i = countNumPerLine % 5; i < 5; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        System.out.println("\n5.Проверка количества двоек на четность/нечетность\n");
        int num6 = 10020200;
        int counterDeuces = 0;
        int originalNum6 = num6;
        //считаем кол-во двоек
        while (num6 != 0) {
            if (num6 % 10 == 2) {
                counterDeuces++;
            }
            num6 /= 10;
        }
        //определяем чет/нечет кол-ва двоек
        if(counterDeuces % 2 == 0) {
            System.out.println("Число " + originalNum6 + " содержит " + counterDeuces +
                    " четное количество двоек");
        } else {
            System.out.println("Число " + originalNum6 + " содержит " + counterDeuces +
                    " нечетное количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли\n");
        System.out.println("\nФигура квадрат\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }

        System.out.println("\nПрямоугольный треугольник\n");
        int num7 = 5;
        int count7 = 0;
        while(count7 < num7) {
            int hash = num7 - count7;
            while(hash > 0){
                System.out.print('#');
                hash--;
            }
            System.out.println();
            count7++;
        }
        System.out.println("\nФигура треугольник №2\n");
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

        System.out.println("\nОтображение ASCII-символов\n");
        int codeAscii = 32;
        System.out.printf("%-3s %-5s\n","DEC","CHAR");
        for (int i = 0; i < 92; ++i) {
            if (codeAscii % 2 != 0 && codeAscii < 48) {
                System.out.printf("%3d %4s\n", codeAscii, (char)codeAscii);
            } else if (codeAscii % 2 == 0 && codeAscii >= 97) {
                System.out.printf("%3d %4s\n", codeAscii, (char)codeAscii);
            }
            codeAscii++;
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        long num8 = 123456787654321L;
        long reversedNum8 = 0;
        long lastDigit;
        long originalNum8;
        originalNum8 = num8;
  
        // переворачиваем число
        while( num8 != 0 ) {
            lastDigit = num8 % 10;
            reversedNum8 = reversedNum8 * 10 + lastDigit;
            num8  /= 10;
        }

        // проверяем, является ли число палиндромом
        if (originalNum8 == reversedNum8) {
            System.out.println(originalNum8 + " является палиндромом");
        } else {
            System.out.println(originalNum8 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        int num9 = 528456; 
        int sumLast3Digit = 0; 
        int sumFirst3Digit = 0; 
        for(int i = 0; i < 3; i++){ 
            sumLast3Digit += num9 / Math.pow(10, i) % 10;
            sumFirst3Digit += num9 / Math.pow(10, 5-i) % 10;
        } 
        System.out.println("Сумма цифр " + num9 / 1000 + " = " + sumFirst3Digit);
        System.out.println("Сумма цифр " + num9 % 1000 + " = " + sumLast3Digit);
        if(sumLast3Digit == sumFirst3Digit) 
            System.out.println("Число счастливое");
        else 
            System.out.println("Число не счастливое");

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