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
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("первоначальное значение byteMax = " + byteMax + "\n" + 
                "значение byteMax после инкремента = " + ++byteMax + "\n" + 
                "значение byteMax после декремента = " + --byteMax + "\n\n" + 
                "первоначальное значение shortMax = " + shortMax + "\n" + 
                "значение shortMax после инкремента = " + ++shortMax + "\n" + 
                "значение shortMax после декремента = " + --shortMax + "\n\n" + 
                "первоначальное значение intMax = " + intMax + "\n" + 
                "значение intMax после инкремента = " + ++intMax + "\n" + 
                "значение intMax после декремента = " + --intMax + "\n\n" + 
                "первоначальное значение longMax = " + longMax + "\n" + 
                "значение longMax после инкремента = " + ++longMax + "\n" + 
                "значение longMax после декремента = " + ++longMax + "\n\n");

        System.out.println("5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        int temp = num2;
        System.out.println("с помощью третьей переменной:\n" + 
                "исходные значения переменных. num1 = " + num1 + ", num2 = " + num2);
        num2 = num1;
        num1 = temp;
        System.out.println("новые значения переменных. num1 = " + num1 + ", num2 = " + num2 +"\n\n" + 
                "c помощью арифметических операций:\n" + 
                "исходные значения переменных. num1 = " + num1 + ", num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения переменных. num1 = " + num1 + ", num2 = " + num2 +"\n\n" + 
                "с помощью побитной операции ^:\n" + 
                "исходные значения переменных. num1 = " + num1 + ", num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новые значения переменных. num1 = " + num1 + ", num2 = " + num2 +"\n");

        System.out.println("6. Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char lowLine = '_';
        System.out.println("код " + (int) hash + " = символ " + hash + "\n" +
                "код " + (int) ampersand + " = символ " + ampersand + "\n" +
                "код " + (int) at + " = символ " + at + "\n" +
                "код " + (int) caret + " = символ " + caret + "\n" +
                "код " + (int) lowLine + " = символ " + lowLine + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    "+ slash + backSlash + "\n" + 
                "   " + slash + "  "+ backSlash + "\n" +
                "  " + slash + lowLine + leftParenthesis + " " + rightParenthesis + 
                backSlash + "\n" + " " + slash + "      " + backSlash + "\n" + 
                slash + lowLine + lowLine + lowLine + lowLine + 
                slash + backSlash + lowLine + lowLine + backSlash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num3 = 123;
        int hundreds = num3 / 100;
        int dozens = num3 / 10 % 10;
        int units = num3 % 10;
        int sumDigits = hundreds + dozens + units;
        int multDigits = hundreds * dozens * units;
        System.out.println("Число N содержит:\n" + hundreds + " сотен\n" + dozens + " десятков\n" + 
                units + " единиц\n" + "Сумма его цифр = " + sumDigits + "\nПроизведение = " + 
                multDigits + "\n");

        System.out.println("9. Вывод времени");
        int seconds = 86399;
        int hh = seconds / 3600 % 24;
        int mm = seconds % 3600 / 60;
        int ss = seconds % 60;
        System.out.println(hh +":" + mm + ":"+ ss);
    }
}