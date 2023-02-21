public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jagerOne = new Jaeger();
        System.out.println("modelName = " + jagerOne.getModelName());
        System.out.println("mark = " + jagerOne.getMark());
        System.out.println("speed = " + jagerOne.getSpeed());
        System.out.println(jagerOne.drift());
    }
}
