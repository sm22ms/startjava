public class Jaeger {
    private String modelName;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;
    private String weapon1;
    private String weapon2;

    public Jaeger() {
        this.modelName = null;
        this.height = 0.0;
        this.weight = 0.0;
        this.speed = 0;
        this.strength = 0;
        this.armor = 0;
        this.weapon1 = null;
        this.weapon2 = null;
    }

    public Jaeger(String modelName, double height, double weight, int speed, int strength,
            int armor, String weapon1, String weapon2) {
        this.modelName = modelName;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeapon1() {
        return this.weapon1;
    }

    public void setWeapon1(String weapon) {
        this.weapon1 = weapon;
    }

    public String getWeapon2() {
        return this.weapon2;
    }

    public void setWeapon2(String weapon) {
        this.weapon2 = weapon;
    }
}