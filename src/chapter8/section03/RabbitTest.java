package chapter08.section03;

public class RabbitTest {
    public static void main(String[] args) {
//        Rabbit rabbit = new Rabbit();//추상클래스 new연산자로 객체 생성 불가능
        HouseRabbit h = new HouseRabbit();
        MoutainRabbit m = new MoutainRabbit();

        h.move(10, 20);
        m.move(1000, 2000);

        m.run();

        h.eat("grasses");
        h.shape = "Circle Rabbit";
    }
}