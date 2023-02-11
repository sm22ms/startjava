public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль\n");
        byte numCpu = 2;
        short valueRam = 16;
        int numHdd = 1;
        long valueHdd = 500;
        float cpuFrequency1 = 3.42f;
        double cpuFrequency2 = 3.41;
        char videoCardType = 'M';
        boolean wifiConnection = true;
        System.out.println(numCpu + " CPU\n" + valueRam + "GB RAM value\n" + 
                numHdd + " HDD\n" + valueHdd + 
                "GB HDD value\n" + cpuFrequency1 + " CPU1 frequency\n" + cpuFrequency2 + 
                " CPU2 frequency\n" + videoCardType +" Video Card Type\n" + wifiConnection + 
                " WIFI connection\n"); 

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        float discount = 0.11f;
        int fullPrice = penPrice + bookPrice;
        double sumDiscount = fullPrice * discount;
        double discountPrice = fullPrice - sumDiscount;
        System.out.println("общая стоимость товаров без скидки = " + fullPrice + "\n" +
                "сумма скидки = " + sumDiscount + "\n" +
                "общая стоимость товаров со скидкой = " + discountPrice + "\n");

        System.out.println("3. Вывод слова JAVA\n\n" + 
                "           J    a  v     v  a\n" + 
                "           J   a a  v   v  a a\n" + 
                "        J  J  aaaaa  V V  aaaaa\n" + 
                "         JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        System.out.println("первоначальное значение num1 = " + num1 + "\n" + 
                "значение num1 после инкремента = " + num1++ + "\n" + 
                "значение num1 после декремента = " + num1-- + "\n\n" + 
                "первоначальное значение num2 = " + num2 + "\n" + 
                "значение num2 после инкремента = " + num2++ + "\n" + 
                "значение num2 после декремента = " + num2-- + "\n\n" + 
                "первоначальное значение num3 = " + num3 + "\n" + 
                "значение num3 после инкремента = " + num3++ + "\n" + 
                "значение num3 после декремента = " + num3-- + "\n\n" + 
                "первоначальное значение num4 = " + num4 + "\n" + 
                "значение num4 после инкремента = " + num4++ + "\n" + 
                "значение num4 после декремента = " + num4-- + "\n\n");

        System.out.println("5. Перестановка значений переменных\n");
        int num6 = 2;
        int num7 = 5;
        int temp =num7;
        System.out.println("с помощью третьей переменной:\n" + 
                "исходные значения переменных. num6 = " + num6 + ", num7 = " + num7);
        num7 = num6;
        num6 = temp;
        System.out.println("новые значения переменных. num6 = " + num6 + ", num7 = " + num7 +"\n\n" + 
                "c помощью арифметических операций:\n" + 
                "исходные значения переменных. num6 = " + num6 + ", num7 = " + num7);
        num6 += num7;
        num7 = num6 - num7;
        num6 -= num7;
        System.out.println("новые значения переменных. num6 = " + num6 + ", num7 = " + num7 +"\n\n" + 
                "с помощью побитной операции ^:\n" + 
                "исходные значения переменных. num6 = " + num6 + ", num7 = " + num7);
        num6 ^= num7;
        num7 ^= num6;
        num6 ^= num7;
        System.out.println("новые значения переменных. num6 = " + num6 + ", num7 = " + num7 +"\n");

        System.out.println("6. Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char horizontalBar = '_';
        System.out.println("код " + (int) hash + " = символ " + hash + "\n" +
                "код " + (int) ampersand + " = символ " + ampersand + "\n" +
                "код " + (int) at + " = символ " + at + "\n" +
                "код " + (int) caret + " = символ " + caret + "\n" +
                "код " + (int) horizontalBar + " = символ " + horizontalBar + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char forwardSlash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    "+ forwardSlash + backSlash + "\n" + 
                "   " + forwardSlash + "  "+ backSlash + "\n" +
                "  " + forwardSlash + horizontalBar + leftParenthesis + " " + rightParenthesis + 
                backSlash + "\n" + " " + forwardSlash + "      " + backSlash + "\n" + 
                forwardSlash + horizontalBar + horizontalBar + horizontalBar + horizontalBar + 
                forwardSlash + backSlash + horizontalBar + horizontalBar + backSlash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num5 = 123;
        int digit1 = num5 / 100;
        int digit2 = num5 / 10 % 10;
        int digit3 = num5 % 10;
        int sumDigits = digit1 + digit2 + digit3;
        int multDigits = digit1 * digit2 * digit3;
        System.out.println("Число N содержит:\n" + digit1 + " сотен\n" + digit2 + " десятков\n" + 
                digit3 + " единиц\n" + "Сумма его цифр = " + sumDigits + "\nПроизведение = " + 
                multDigits + "\n");

        System.out.println("9. Вывод времени");
        int seconds = 86399;
        int hh = seconds / 3600 % 24;
        int mm = seconds % 3600 / 60;
        int ss = seconds % 60;
        System.out.println(hh +":" + mm + ":"+ ss);
    }
}