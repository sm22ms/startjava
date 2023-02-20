public class Jaeger {

    String modelName = "Bracer Phoenix";
    String mark = "Mark-5";
    String origin = "USA";
    float height = 70.7f;
    float weight = 2.1f;
    int speed = 3;
    int strength = 8;
    int armor = 9;

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли пять шагов");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }
}