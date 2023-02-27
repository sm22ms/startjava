public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setHeight(85.34);
        chernoAlpha.setWeight(2.412);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
        chernoAlpha.setWeapon1("Z-14 Tesla fists");
        chernoAlpha.setWeapon2("Incinerator turbines");

        Jaeger crimsonTyphoon = new Jaeger("Gipsy Danger", 76.2, 1722.0, 9, 8, 6,
                "Wrist-Mounted Saws", "Typhoon Burst Cannons");

        System.out.println("Cherno Alpha:");
        System.out.println("Model: " + chernoAlpha.getModelName());
        System.out.println("Height: " + chernoAlpha.getHeight() + "m");
        System.out.println("Weight: " + chernoAlpha.getWeight() + " tons");
        System.out.println("Speed: " + chernoAlpha.getSpeed());
        System.out.println("Strength: " + chernoAlpha.getStrength());
        System.out.println("Armor: " + chernoAlpha.getArmor());
        System.out.println("Weapons: " + chernoAlpha.getWeapon1() + ", " + chernoAlpha.getWeapon2());

        System.out.println("\nCrimson Typhoon:");
        System.out.println("Model: " + crimsonTyphoon.modelName);
        System.out.println("Height: " + crimsonTyphoon.height + "m");
        System.out.println("Weight: " + crimsonTyphoon.weight + " tons");
        System.out.println("Speed: " + crimsonTyphoon.speed);
        System.out.println("Strength: " + crimsonTyphoon.strength);
        System.out.println("Armor: " + crimsonTyphoon.armor);
        System.out.println("Weapons: " + crimsonTyphoon.weapon1 + ", " + crimsonTyphoon.weapon2);
    }
}
