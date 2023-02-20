public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jagerOne = new Jaeger();
        System.out.println("modelName = " + jagerOne.modelName);
        System.out.println("mark = " + jagerOne.mark);
        System.out.println("speed = " + jagerOne.speed);
        System.out.println(jagerOne.drift());
    }
}
