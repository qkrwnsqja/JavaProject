package Chapter07.access;

public class RabbiPrivateTest {
    public static void main(String[] args) {
        RabbitPrivate r1 = new RabbitPrivate();
        r1.setShape("Rectangle");
        r1.setPosition(50, 100);

        System.out.println("토끼 모양: " + r1.getShape());
        System.out.println("토끼 현재 위치: (" + r1.getX() + " , " + r1.getY() + ")");

        System.out.printf("토끼 모양은 [%s]입니다.\n", r1.getShape());
        System.out.printf("토끼 모양은 (%d , %d))입니다.", r1.getX(), r1.getY());
    }
}
