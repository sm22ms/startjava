public class MyFirstGame {
    public static void main(String[] args) {
        // Игра угадать число загаданное компьютером
        int computerNumber = (int) (Math.random() * 100) + 1; // Компьютер загадывает число (1,100]
        int playerNumber = (int) (Math.random() * 100) + 1; 
        
        while (playerNumber != computerNumber) {
            if (playerNumber > computerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
        
        System.out.println("Вы победили!");
    }
}
