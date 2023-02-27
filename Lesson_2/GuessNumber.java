public class GuessNumber {
    private int secretNumber;

    public GuessNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
    }

    public boolean guess(Player player) {
        int guessNumber = player.getNumber();

        if (guessNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число!");
            return true;
        } else if (guessNumber < secretNumber) {
            System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + guessNumber + " больше того, что загадал компьютер");
        }

        return false;
    }
}