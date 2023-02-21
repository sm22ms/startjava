public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("bitch");
        wolfOne.setName("Jane");
        wolfOne.setWeight(40);
        wolfOne.setAge(9);
        wolfOne.setColor("white");

        System.out.println("\nWolf identification:\n");
        System.out.println("Wolf sex = " + wolfOne.getSex());
        System.out.println("Wolf name = " + wolfOne.getName());
        System.out.println("Wolf weight = " + wolfOne.getWeight());
        System.out.println("Wolf age = " + wolfOne.getAge());
        System.out.println("Wolf color = " + wolfOne.getColor());

        System.out.println("\nThis wolf can do:\n");
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
