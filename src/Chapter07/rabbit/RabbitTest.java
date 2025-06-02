package Chapter07.rabbit;

public class RabbitTest {
    public static void main(String[] args) {
        rabbit rabbit1 = new rabbit();
        rabbit rabbit2 = new rabbit();
        rabbit rabbit3 = new rabbit();

        rabbit1.setShape("분홍네모");
        rabbit2.setShape("갈색세모");
        rabbit3.setShape("파랑동그라미");

        rabbit1.setPosition(50, 60);
        rabbit2.setPosition(100, 80);
        rabbit3.setPosition(150, 80);

        System.out.println(rabbit1);
        System.out.println(rabbit2);
        System.out.println(rabbit3);

        rabbit1.move();
        rabbit2.move();
        rabbit3.move();
    }
}