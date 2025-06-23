package chapter08.section03;

public class MoutainRabbit extends Rabbit {

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void run(){
        System.out.println("Moutain Rabbit은 이산 저산 뛰어다닌다.");
    }

}