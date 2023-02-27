public class Jaeger {
    public String modelName;
    public double height;
    public double weight;
    public int speed;
    public int strength;
    public int armor;
    public String weapon1;
    public String weapon2;

    public Jaeger() {
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
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(String weapon) {
        this.weapon1 = weapon;
    }

    public String getWeapon2() {
        return weapon2;
    }

    public void setWeapon2(String weapon) {
        this.weapon2 = weapon;
    }
}