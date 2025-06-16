package chapter8.section02;

public class MoutainRabbit extends Rabbit {
    String Moutainname;

    public MoutainRabbit() {
        super();
        System.out.println("MoutainRabbit의 생성자가 실행됨.");
    }

    void eatWildglass(){
        System.out.println("산토끼는 풀을 먹는다.");
    }
}
