public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 10;
        if(age > 10) {
            System.out.println("Вы можете пройти на аттракцион, Вам есть " + age + " лет.");
        } else {
            System.out.println("Вы не можете пройти на аттракцион, Вам нет " + age + " лет.");
        }

        boolean isManSex = false;
        if(!isManSex) {
            System.out.println("Вы женщина, Вам идти направо");
        } else {
            System.out.println("Вы мужчина, Вам идти налево");
        }

        double height = 1.70;
        if(height < 1.80) {
            System.out.println("Вам нужно одеть красный жилет");
        } else {
            System.out.println("Вам нужно надеть зеленый жилет");
        }

        char firstCharName = "Ivan".charAt(0);
        if(firstCharName == 'M') {
            System.out.println("Ваша очередь №1");
        } else if(firstCharName == 'I') {
            System.out.println("Ваша очередь №2");
        } else {
            System.out.println("Ваша очередь №3");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 40;
        int num2 = 30;
        if(num1 > num2) {
            System.out.println("max число, " + num1 + " min число " + num2) ;
        } else if(num1 < num2) {
            System.out.println("max число, " + num2 + " min число " + num1);
        } else {
            System.out.println(num1 + " " + num2 + " равны, max и min значения не найти");
        }

        System.out.println("\n3. Проверка числа\n");
        int number = 16;
        System.out.println("Число: " + number);
        if(number != 0) {
            if(number % 2 == 0) {
                System.out.print("Четное. ");
            } else {
                System.out.print("Нечетное. ");
            }
            if(number > 0) {
                System.out.print("Положительное. ");
            } else {
                System.out.print("Отрицательное. ");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num4 = 123;
        int hundredsNum4 = num4 / 100;
        int tensNum4 = num4 / 10 % 10;
        int onesNum4 = num4 % 10;
        int num5 = 223;
        int hundredsNum5 = num5 / 100;
        int tensNum5 = num5 / 10 % 10;
        int onesNum5 = num5 % 10;
        boolean isEqualHundreds = hundredsNum4 == hundredsNum5;
        boolean isEqualTens = tensNum4 == tensNum5;
        boolean isEqualOnes = onesNum4 == onesNum5;
        System.out.println("исходные числа "+ num4 + " и " + num5 + ":");
        if(!isEqualHundreds && !isEqualTens && !isEqualOnes) {
            System.out.println("одинаковые числа в разрядах отсутствуют");
        } else {
            if(isEqualHundreds) {
                System.out.println("число " + hundredsNum4 + "  в разряде 3");
            };
            if(isEqualTens) {
                System.out.println("число " + tensNum4 + "  в разряде 2");
            };
            if(isEqualOnes) {
                System.out.println("число " + onesNum4 + "  в разряде 1");
            }
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char someChar = '\u0071';
        System.out.println(someChar);
        if(someChar >= 'a' && someChar <= 'z') {
            System.out.println("маленькая буква"); 
        } else if(someChar >= 'a' && someChar <= 'z') {
            System.out.println("большая буква");
        } else if(someChar >= '0' && someChar <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком\n");
        double bankDeposit = 250;
        double percentRate = 10;
        if(bankDeposit < 100000) {
            percentRate = 5;
        } else if (bankDeposit >= 100000 & bankDeposit <= 300000) {
            percentRate = 7;
        } 
        
        System.out.println("Сумма Вклада = " + bankDeposit + "\nначисленный % = " + 
                bankDeposit * percentRate / 100 + "\nИтоговая сумма с % = " + 
                bankDeposit * (percentRate + 100) / 100);

        System.out.println("\n7. Определение оценки по предметам\n");
        double historyPercent = 98;
        int historyGrade = 5;
        if(historyPercent <= 60) {
            historyGrade = 2;
        } else if(historyPercent > 60 & historyPercent <= 73) {
            historyGrade = 3;
        } else if(historyPercent > 73 & historyPercent <= 91) {
            historyGrade = 4;
        }

        double programmingPercent = 96;
        int programmingGrade = 5;
        if(programmingPercent <= 60) {
            programmingGrade = 2;
        } else if(programmingPercent > 60 & programmingPercent <= 73) {
            programmingGrade = 3;
        } else if(programmingPercent > 73 & programmingPercent <= 91) {
            programmingGrade = 4;
        }
 
        System.out.println(historyGrade + " за Историю и " + programmingGrade + 
                " за Программирование\n" + (double) ((historyGrade + programmingGrade) / 2) + 
                " средний бал оценок\n" + 
                (historyPercent + programmingPercent) / 2 + 
                " средний % по предметам");

        System.out.println("\n8. Расчет прибыли за год\n");
        int rentCost = 5000;
        int monthProfit = 500000;
        int netCost = 9000;
        int yearProfit = (monthProfit - netCost - rentCost) * 12;
        if(yearProfit <=0) {
            System.out.println("прибыль за год составила " + yearProfit);
        } else if(yearProfit > 0) {
            System.out.println("прибыль за год составила +" + yearProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int atm100Usd = 10;
        int atm10Usd = 5;
        int atm1Usd = 50;
        int requiredAmount = 567;

        if(atm100Usd * 100 + atm10Usd * 10 + atm1Usd < requiredAmount) {
            System.out.println("Недостаточно денег в банкомате");
        } else {
            //переменные если денег достаточно для вывода любой суммы
            int withdrawal100Usd = requiredAmount / 100;
            int withdrawal10Usd = requiredAmount / 10 % 10;
            int withdrawal1Usd = requiredAmount % 10;

            //если не хватает 100$, берем 10$
            if(atm100Usd < withdrawal100Usd) {                
                withdrawal10Usd += withdrawal100Usd * 10 - atm100Usd * 10;
                withdrawal100Usd = atm100Usd;
            }

            //если еще и 10$ не хватает, то берем 1$
            if (atm10Usd < withdrawal10Usd) {
                withdrawal1Usd += withdrawal10Usd * 10 - atm10Usd * 10;
                withdrawal10Usd = atm10Usd;
            } 
            //вывод результата
            System.out.println("Номиналы банкнот:");
            System.out.println("100$: " + withdrawal100Usd);
            System.out.println("10$: " + withdrawal10Usd);
            System.out.println("1$: " + withdrawal1Usd);
            System.out.println("Выдаваемая сумма $: " + requiredAmount);
        }
    }
}