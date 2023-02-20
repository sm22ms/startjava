public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "bitch";
        wolfOne.name = "Whitty";
        wolfOne.weight = 30.1;
        wolfOne.age = 6;
        wolfOne.color = "white";

        System.out.println("Wolf identification:");
        System.out.println("Wolf sex = " + wolfOne.sex);
        System.out.println("Wolf name = " + wolfOne.name);
        System.out.println("Wolf weight = " + wolfOne.weight);
        System.out.println("Wolf age = " + wolfOne.age);
        System.out.println("Wolf color = " + wolfOne.color);

        System.out.println("\nThis wolf can do:");
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
