public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 10;
        boolean manSex = false;
        double height = 1.70;
        char firstCharName = "Ivan".charAt(0);
        if(age > 10) {
            System.out.println("Вы можете пройти на аттракцион, Вам есть " + age + " лет.");
        } else {
            System.out.println("Вы не можете пройти на аттракцион, Вам нет " + age + " лет.");
        }
        if(!manSex) {
            System.out.println("Вы женщина, Вам идти направо");
        } else {
            System.out.println("Вы мужчина, Вам идти налево");
        }
        if(height < 1.80) {
            System.out.println("Вам нужно одеть красный жилет");
        } else {
            System.out.println("Вам нужно надеть зеленый жилет");
        }
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
        int num3 = 15;
        boolean isZero = num3 / 2 == 0;
        boolean isEvenNum = num3 % 2 == 0;
        boolean isPositiveNum = num3 > 0;
        if(isZero) {
            System.out.println("Исходное число " + num3 + " равно искомому нулю\n");
        } else {
            if(isEvenNum & isPositiveNum) {
                System.out.println("Исходное число " + num3 + " четное и положительное\n");
            } else if(isEvenNum) {
                System.out.println("Исходное число " + num3 + " четное отрицательно\n");
            } else if(!isEvenNum & !isPositiveNum) {
                System.out.println("Исходное число " + num3 + " нечетное и отрицательное\n");
            } else {
                System.out.println("Исходное число " + num3 + " нечетное положительно\n");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах\n");
        int num4 = 456;
        int hundredsNum4 = num4 / 100;
        int dozensNum4 = num4 / 10 % 10;
        int unitsNum4 = num4 % 10;
        int num5 = 556;
        int hundredsNum5 = num5 / 100;
        int dozensNum5 = num5 / 10 % 10;
        int unitsNum5 = num5 % 10;
        boolean isHundredsEqual = hundredsNum4 == hundredsNum5;
        boolean isDozensEqual = dozensNum4 == dozensNum5;
        boolean isUnitsEqual = unitsNum4 == unitsNum5;
        // для сокращения кода в выводимом результате ввел переменную String
        String textMessage = "исходные числа "+ num4 + " и " + num5 + "," + " равные числа ";
        if(!isHundredsEqual & !isDozensEqual & !isUnitsEqual) {
            System.out.println(textMessage + "в разрядах отсутствуют");
        } else {
            if(isHundredsEqual & !isDozensEqual & !isUnitsEqual) {
                System.out.println(textMessage + hundredsNum4 + " только в разряде 3");
            } else if(!isHundredsEqual & isDozensEqual & !isUnitsEqual) {
                System.out.println(textMessage + dozensNum4 + " только в разряде 2");
            } else if(!isHundredsEqual & !isDozensEqual & isUnitsEqual) {
                System.out.println(textMessage + unitsNum4 + " только в разряде 1");
            } else if(isHundredsEqual & isDozensEqual & !isUnitsEqual) {
                System.out.println(textMessage + hundredsNum4 + " и " + dozensNum4 +
                        " только в разрядах 3 и 2");
            } else if(isHundredsEqual & !isDozensEqual & isUnitsEqual) {
                System.out.println(textMessage + hundredsNum4 + " и " + unitsNum4 + 
                        " только в разрядах 3 и 1");
            } else if(!isHundredsEqual & isDozensEqual & isUnitsEqual) {
                System.out.println(textMessage + dozensNum4 + " и " + unitsNum4 + 
                        " только в разрядах 2 и 1");
            } else {
                System.out.println(textMessage + hundredsNum4 + ", " + dozensNum4 + " и " + 
                        unitsNum4 + " в разрядах 3, 2, 1");
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
        double bankDeposit = 300000;
        double depositLowPerсent = 0.05;
        double depositMiddlePerсent = 0.07;
        double depositHighPerсent = 0.10;
        if(bankDeposit < 100000) {
            System.out.println("сумма вклада " + bankDeposit + "\nначисленный процент " + 
                    (double)(bankDeposit * depositLowPerсent) + "\nитоговая сумма с % " + 
                    (double)(bankDeposit * depositLowPerсent + bankDeposit));
        } else if(bankDeposit >= 100000 & bankDeposit <= 300000) {
            System.out.println("сумма вклада " + bankDeposit + "\nначисленный процент " + 
                    (float)(bankDeposit * depositMiddlePerсent) + "\nитоговая сумма с % " + 
                    (float)(bankDeposit * depositMiddlePerсent + bankDeposit));
        } else if(bankDeposit > 300000) {
            System.out.println("сумма вклада " + bankDeposit + "\nначисленный процент " + 
                    (float)(bankDeposit * depositHighPerсent) + "\nитоговая сумма с % " + 
                    (float)(bankDeposit * depositHighPerсent + bankDeposit));
        }

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyGradePercent = 59;
        int programmingGradePercent = 91;
        float averageGradePercent = (historyGradePercent + programmingGradePercent)/2;
        int grade2 = 2;
        int grade3 = 3;
        int grade4 = 4;
        int grade5 = 5;
        if(historyGradePercent <= 60){
            if(programmingGradePercent <=60) {
                System.out.println("История " + grade2 + ", Программирование " + grade2 +
                        "\nСредний бал оценок по предметам " + (double)(grade2 + grade2) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 60 & programmingGradePercent <= 73) {
                System.out.println("История " + grade2 + ", Программирование " + grade3 +
                        "\nСредний бал оценок по предметам " + (double)(grade2 + grade3) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 73 & programmingGradePercent <= 91) {
                System.out.println("История " + grade2 + ", Программирование " + grade4 +
                        "\nСредний бал оценок по предметам " + (double)(grade2 + grade4) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else {
                System.out.println("История " + grade2 + ", Программирование " + grade5 +
                        "\nСредний бал оценок по предметам " + (double)(grade2 + grade5) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } 
        } else if(historyGradePercent > 60 & historyGradePercent <= 73) {
            if(programmingGradePercent <= 60) {
                System.out.println("История " + grade3 + ", Программирование " + grade2 +
                        "\nСредний бал оценок по предметам " + (double)(grade3 + grade2) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 60 & programmingGradePercent <= 73) {
                System.out.println("История " + grade3 + ", Программирование " + grade3 +
                        "\nСредний бал оценок по предметам " + (double)(grade3 + grade3) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 73 & programmingGradePercent <= 91) {
                System.out.println("История " + grade3 + ", Программирование " + grade4 +
                        "\nСредний бал оценок по предметам " + (double)(grade3 + grade4) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else {
                System.out.println("История " + grade3 + ", Программирование " + grade5 +
                        "\nСредний бал оценок по предметам " + (double)(grade3 + grade5) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } 
        } else if(historyGradePercent > 73 & historyGradePercent <= 91) {
            if(programmingGradePercent <= 60) {
                System.out.println("История " + grade4 + ", Программирование " + grade2 +
                        "\nСредний бал оценок по предметам " + (double)(grade4 + grade2) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 60 & programmingGradePercent <= 73) {
                System.out.println("История " + grade4 + ", Программирование " + grade3 +
                        "\nСредний бал оценок по предметам " + (double)(grade4 + grade3) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 73 & programmingGradePercent <= 91) {
                System.out.println("История " + grade4 + ", Программирование " + grade4 +
                        "\nСредний бал оценок по предметам " + (double)(grade4 + grade4) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else {
                System.out.println("История " + grade4 + ", Программирование " + grade5 +
                        "\nСредний бал оценок по предметам " + (double)(grade4 + grade5) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } 
        } else if(historyGradePercent > 90) {
            if(programmingGradePercent <= 60) {
                System.out.println("История " + grade5 + ", Программирование " + grade2 +
                        "\nСредний бал оценок по предметам " + (double)(grade5 + grade2) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 60 & programmingGradePercent <= 73) {
                System.out.println("История " + grade5 + ", Программирование " + grade3 +
                        "\nСредний бал оценок по предметам " + (double)(grade5 + grade3) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else if(programmingGradePercent > 73 & programmingGradePercent <= 91) {
                System.out.println("История " + grade5 + ", Программирование " + grade4 +
                        "\nСредний бал оценок по предметам " + (double)(grade5 + grade4) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } else {
                System.out.println("История " + grade5 + ", Программирование " + grade5 +
                        "\nСредний бал оценок по предметам " + (double)(grade5 + grade5) / 2 + 
                        "\nСредний % по предментам " + averageGradePercent);
            } 
        }

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