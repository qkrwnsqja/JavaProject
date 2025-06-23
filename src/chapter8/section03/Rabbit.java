package chapter08.section03;

// 추상클래스
// 추상클래스는 new연산자를 사용한 객체 생성이 불가능
// 추상클래스가 객체화(메모리에 할당)되서 필드와 메소드를 사용하려면
// sub(자식)클래스를 통해서 객체화해서 사용한다.
// 추상클래스의 용도:
// - 자식클래스들에게 특정기능들을 표준화(약속을 정함) 시키기 위해 사용한다.
// - 약속을 지킨 sub클래스는 부모의 필드와 메소드를 사용할 수 있음.
// 약속을 정하는 메소드: 추상메소드(abstract)

abstract public class Rabbit {
    String shape;
    int x, y;

    abstract public void move(int x, int y);//추상메소드

    public void eat(String food){
        System.out.println("Rabbit " + shape + " eats " + food);
    }
}