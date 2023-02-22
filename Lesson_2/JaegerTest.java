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

        System.out.printf("Model: %s\n" +
                "Height: %.1fm\n" +
                "Weight: %.1f tons\n" +
                "Speed: %d\n" +
                "Strength: %d\n" +
                "Armor: %d\n" +
                "Weapons: %s, %s\n",
                chernoAlpha.getModelName(),
                chernoAlpha.getHeight(),
                chernoAlpha.getWeight(),
                chernoAlpha.getSpeed(),
                chernoAlpha.getStrength(),
                chernoAlpha.getArmor(),
                chernoAlpha.getWeapon1(),
                chernoAlpha.getWeapon2());

        System.out.printf("\nModel: %s\n" +
                "Height: %.1fm\n" +
                "Weight: %.1f tons\n" +
                "Speed: %d\n" +
                "Strength: %d\n" +
                "Armor: %d\n" +
                "Weapons: %s, %s\n",
                crimsonTyphoon.getModelName(),
                crimsonTyphoon.getHeight(),
                crimsonTyphoon.getWeight(),
                crimsonTyphoon.getSpeed(),
                crimsonTyphoon.getStrength(),
                crimsonTyphoon.getArmor(),
                crimsonTyphoon.getWeapon1(),
                crimsonTyphoon.getWeapon2());
    }
}
