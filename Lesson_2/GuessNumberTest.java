import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра Угадай число загаданное компьютером число в [0,100)\n");

        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber();

        boolean gameOver = false;

        while (!gameOver) {
            System.out.println(player1.getName() + ", введите число:");
            player1.setNumber(scanner.nextInt());

            if (game.guess(player1)) {
                gameOver = true;
                break;
            }

            System.out.println(player2.getName() + ", введите число:");
            player2.setNumber(scanner.nextInt());

            if (game.guess(player2)) {
                gameOver = true;
                break;
            }
        }

        System.out.println("Хотите продолжить игру? [yes/no]:");
        String answer = scanner.next();

        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Неверный ввод, попробуйте еще раз.");
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.next();
        }

        if (answer.equals("yes")) {
            game = new GuessNumber();
            player1.setNumber(0);
            player2.setNumber(0);
            main(args);
        } else {
            System.out.println("Игра завершена.");
        }

        scanner.close();
    }
}