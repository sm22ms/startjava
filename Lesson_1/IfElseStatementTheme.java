public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 10;
        if(age > 10) {
            System.out.println("Вы можете пройти на аттракцион, Вам есть " + age + " лет.");
        } else {
            System.out.println("Вы не можете пройти на аттракцион, Вам нет " + age + " лет.");
        }

        boolean manSex = false;
        if(!manSex) {
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
            System.out.println("Ваша очередь №1\n");
        } else if(firstCharName == 'I') {
            System.out.println("Ваша очередь №2\n");
        } else {
            System.out.println("Ваша очередь №3");
        }


        System.out.println("2. Поиск max и min числа\n");
        int num1 = 40;
        int num2 = 30;
        if(num1 > num2) {
            System.out.println("max число, " + num1 + " min число " + num2 + "\n");
        } else if(num1 < num2) {
            System.out.println("max число, " + num2 + " min число " + num1 + "\n");
        } else {
            System.out.println(num1 + " " + num2 + " равны, max и min значение не найти" + "\n");
        }


        System.out.println("3. Проверка числа\n");
        int num3 = -15;
        boolean isEvenNum = num3 % 2 == 0;
        boolean isPositiveNum = num3 > 0;
        if(num3 == 0) {
            System.out.println("Исходное число " + num3 + " равно искомому нулю\n");
        } else {
            if(isEvenNum & isPositiveNum) {
                System.out.println("Исходное число " + num3 + " четное и положительное\n");
            } else if(isEvenNum) {
                System.out.println("Исходное число " + num3 + " четное отрицательно\n");
            } else if(isPositiveNum) {
                System.out.println("Исходное число " + num3 + " нечетное и положительное\n");
            } else {
                System.out.println("Исходное число " + num3 + " нечетное отрицательное\n");
            }
        }


        System.out.println("4. Поиск одинаковых цифр в числах\n");
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
        if(!isEqualHundreds & !isEqualTens & !isEqualOnes) {
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
        if(someChar >= 'a' & someChar <= 'z') {
            System.out.println("маленькая буква"); 
        } else if(someChar >= 'a' & someChar <= 'z') {
            System.out.println("большая буква");
        } else if(someChar >= '0' & someChar <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }


        System.out.println("\n6. Подсчет суммы вклада и начисленных банком\n");
        double bankDeposit = 400000;
        double depositLowPerсent = 5;
        double depositMiddlePerсent = 7;
        double depositHighPerсent = 10;
        double percentRate;
        if(bankDeposit < 100000) {
            percentRate = (double)depositLowPerсent;
        } else if (bankDeposit >= 100000 & bankDeposit <= 300000) {
            percentRate = (double)depositMiddlePerсent;
        } else {
            percentRate = (double)depositHighPerсent;
        }
        
        System.out.println("Сумма Вклада = " + bankDeposit + "\nначисленный % = " + 
                (double)(bankDeposit*percentRate/100) + "\nИтогвая сумма с % = " + 
                (double)(bankDeposit*(percentRate+100)/100));


        System.out.println("\n7. Определение оценки по предметам\n");
        double historyGradePercent = 70;
        double historyGrade;
        if(historyGradePercent <= 60) {
            historyGrade = (int) 2;
        } else if(historyGradePercent > 60 & historyGradePercent <= 73) {
            historyGrade = (int) 3;
        } else if(historyGradePercent > 73 & historyGradePercent <= 91) {
            historyGrade = (int) 4;
        } else {
            historyGrade = (int) 5;
        }

        double programmingGradePercent = 91;
        double programmingGrade;
        if(programmingGradePercent <= 60) {
            programmingGrade = (int) 2;
        } else if(programmingGradePercent > 60 & programmingGradePercent <= 73) {
            programmingGrade = (int) 3;
        } else if(programmingGradePercent > 73 & programmingGradePercent <= 91) {
            programmingGrade = (int) 4;
        } else {
            programmingGrade = (int) 5;
        }
 
        System.out.println(historyGrade + " за Историю и " + programmingGrade + 
                " за Программирование\n" + (double)((historyGrade + programmingGrade) / 2) + 
                " средний бал оценок\n" + 
                (double)((historyGradePercent + programmingGradePercent)/2) + 
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
        int clientRequestMoney = 567;
        int sum100UsdRequest = clientRequestMoney / 100 * 100;
        int sum10UsdRequest = clientRequestMoney / 10 % 10 * 10;
        int sum1UsdRequest = clientRequestMoney % 10;
        int atm100Usd = 10;
        int atm10Usd = 5;
        int atm1Usd = 50;
        int sumAtm100Usd = atm100Usd * 100;
        int sumAtm10Usd = atm10Usd * 10;
        int sumAtmAllUsd = sumAtm100Usd + sumAtm10Usd + atm1Usd;
        int sum1UsdCover10Usd = sum10UsdRequest + sum1UsdRequest;
        int sum10UsdCover100Usd = sum10UsdRequest + sum100UsdRequest;
        boolean isEnough100Usd = sum100UsdRequest <= sumAtm100Usd;
        boolean isEnough10Usd = sum10UsdRequest <= sumAtm10Usd;
        boolean isEnough1Usd = sum1UsdRequest <= atm1Usd;
        boolean isEnough1UsdCoverAll = atm1Usd + sumAtm10Usd + sumAtm100Usd >= clientRequestMoney;
        boolean isEnough1UsdCover10Usd = atm1Usd + sumAtm10Usd >= sum1UsdCover10Usd;
        boolean isEnough10UsdCover100Usd = sumAtm10Usd + sumAtm100Usd >= sum10UsdCover100Usd; 
        if(isEnough100Usd & isEnough10Usd & isEnough1Usd) {
            System.out.println("Получите номиналом 100 USD " + sum100UsdRequest / 100 +
                    "\nПолучи номиналом 10 USD " + sum10UsdRequest / 10 + 
                    "\nПолучи номиналом 1 USD " + sum1UsdRequest +
                    "\nВыдавая сумма " + clientRequestMoney + " USD");
        } else if(isEnough100Usd & !isEnough10Usd & isEnough1UsdCover10Usd) {
            System.out.println("Получите номиналом 100 USD " + sum100UsdRequest / 100 +
                    "\nПолучи номиналом 10 USD " + sumAtm10Usd / 10 + 
                    "\nПолучи номиналом 1 USD " + (int)(sum1UsdCover10Usd - sumAtm10Usd) +
                    "\nВыдавая сумма " + clientRequestMoney + " USD"); 
        } else if(!isEnough100Usd & isEnough10UsdCover100Usd & isEnough1Usd) {
            System.out.println("Получите номиналом 100 USD " + sumAtm100Usd / 100 +
                    "\nПолучи номиналом 10 USD " + 
                            (int)(clientRequestMoney - sumAtm100Usd - sum1UsdRequest) + 
                    "\nПолучи номиналом 1 USD " + sum1UsdRequest +
                    "\nВыдавая сумма " + clientRequestMoney + " USD");
        } else if(isEnough1UsdCoverAll & isEnough1Usd) {
            System.out.println("Получите номиналом 100 USD " + sumAtm100Usd / 100 +
                    "\nПолучи номиналом 10 USD " + sumAtm10Usd / 10 + 
                    "\nПолучи номиналом 1 USD " + 
                            (int)(clientRequestMoney - sumAtm10Usd - sumAtm100Usd) +
                    "\nВыдавая сумма " + clientRequestMoney + " USD");
        } else if(clientRequestMoney > sumAtmAllUsd | !isEnough1Usd) {
            System.out.println("Мы не может выдать запрашиваемую сумму.\n" +
                    "Попробуйте ввести другое количество.");
        }
    }
}