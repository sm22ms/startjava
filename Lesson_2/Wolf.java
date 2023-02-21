public class Wolf {
    private String sex;
    private String name;
    private double weight;
    private int age;
    private String color;

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.printf("incorrect age\n");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("walking");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void run() {
        System.out.println("running");
    }

    public void howl() {
        System.out.println("Awoooooo!");
    }

    public void hunt() {
        System.out.println("hunting");
    }
}
