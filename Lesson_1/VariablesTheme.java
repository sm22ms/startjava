public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль\n");
        byte numCpu = 2;
        short valueRam = 16;
        int numHardDisk = 1;
        long valueHardDisk = 500;
        float cpuFrequency1 = 3.42f;
        double cpuFrequency2 = 3.41;
        char videoCardType = 'M';
        boolean wifiConnection = true;
        System.out.println(numCpu + " CPU\n" + valueRam + "GB RAM value\n" + 
                numHardDisk + " Hard Disk\n" + valueHardDisk + 
                "GB Hard Disk value\n" + cpuFrequency1 + " CPU1 frequence\n" + cpuFrequency2 + 
                " CPU2 frequency\n" + videoCardType +" Video Card Type\n" + wifiConnection + 
                " WIFI connection\n"); 

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int pencilPrice = 100;
        int bookPrice = 200;
        float discount = 0.11f;
        int fullPrice = pencilPrice + bookPrice;
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
        byte a = 127;
        int aIncrement = ++ a;
        int aReduction = -- a;
        short b = 32767;
        int bIncrement = ++ b;
        int bReduction = -- b;
        int c = 2147483647;
        long cIncrement = ++ c;
        int cReduction = -- c;
        long d = 9223372036854775807L;
        long dIncrement = ++ d;
        long dReduction = -- d;
        System.out.println("первоначальное значение A = " + a + "\n" + 
                "значение A после инкремента = " + aIncrement + "\n" + 
                "значение A после декремента = " + aReduction + "\n\n" + 
                "первоначальное значение B = " + b + "\n" + 
                "значение B после инкремента = " + bIncrement + "\n" + 
                "значение B после декремента = " + bReduction + "\n\n" + 
                "первоначальное значение C = " + c + "\n" + 
                "значение C после инкремента = " + cIncrement + "\n" + 
                "значение C после декремента = " + cReduction + "\n\n" + 
                "первоначальное значение D = " + d + "\n" + 
                "значение D после инкремента = " + dIncrement + "\n" + 
                "значение D после декремента = " + dReduction + "\n\n");

        System.out.println("5. Перестановка значений переменных\n");
        int e = 2;
        int f = 5;
        int g;
        System.out.println("с помощью третьей переменной:\n" + 
                "исходные значения переменных. e = " + e + ", f = " + f);
        g = f;
        f = e;
        e = g;
        System.out.println("новые значния переменных. e = " + e + ", f = " + f +"\n\n" + 
                "c помощью арифметических операций:\n" + 
                "исходные значения переменных. e = " + e + ", f = " + f);
        e += f;
        f = e - f;
        e -= f;
        System.out.println("новые значния переменных. e = " + e + ", f = " + f +"\n\n" + 
                "с помощью побитной операции^:\n" + 
                "исходные значения переменных. e = " + e + ", f = " + f);
        e ^= f;
        f ^= e;
        e ^= f;
        System.out.println("новые значния переменных. e = " + e + ", f = " + f +"\n");

        System.out.println("6. Вывод символов и их кодов");
        char asc35 = '#';
        int asc35n = 35;
        char asc38 = '&';
        int asc38n = 38;
        char asc64 = '@';
        int asc64n = 64;
        char asc94 = '^';
        int asc94n = 94;
        char asc95 = '_';
        int asc95n = 95;
        System.out.println("код " + asc35n + " = симол " + asc35 + "\n" +
                "код " + asc38n + " = симол " + asc38 + "\n" +
                "код " + asc64n + " = симол " + asc64 + "\n" +
                "код " + asc94n + " = симол " + asc94 + "\n" +
                "код " + asc95n + " = симол " + asc95 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char s1 = '/';
        char s2 = '\\';
        char s3 = '_';
        char s4 = '(';
        char s5 = ')';
        System.out.println("    "+ s1 + s2 + "\n" + 
                "   " + s1 + "  "+ s2 + "\n" +
                "  " + s1 + s3 + s4 + " " + s5 + s2 + "\n" +
                " " + s1 + "      " + s2 + "\n" + 
                s1 + s3 + s3 + s3 + s3 + s1 + s2 + s3 + s3 + s2 + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int x = n / 100;
        int y = n / 10 % 10;
        int z = n % 10;
        int sumN = x + y + z;
        int multiN = x * y * z;
        System.out.println("Число N содержит:\n" + x + " сотен\n" + y + " десятков\n" + z + 
                " единиц\n" + "Сумма его цифр = " + sumN + "\nПроизведение = " + multiN + "\n");

        System.out.println("9. Вывод времени");
        int seconds = 86399;
        int hh = seconds / 3600 % 24;
        int mm = seconds % 3600 / 60;
        int ss = seconds % 3600 % 60;
        System.out.println(hh +":" + mm + ":"+ ss);
    }
}