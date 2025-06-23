package chapter08.section04;

//<인터페이스>
// new 연산자로 객체 생성 불가능
// 필드: 상수, 메소드: 추상메소드(예외적으로 default 키워드를 붙여서 메소드를 구현가능)
// 인터페이스의 용도:
// - 약속(추상메소드)을 정해 놓고 약속을 지킨 클래스들만 만들 수 있다.
// - 공동작업으로 프로젝트할 때 정말 많이 사용 : 메소드 이름, 반환형, 매개변수 중간에 수정이나 삭제를 함부로 하지 못하게 하기 위해서
// [인터페이스는 상속 받은 클래스]는 추상메소드 외에 일반적인 다른 메소드도 구현 가능

public interface Phone {
    //    인터페이스의 필드는 상수로만 사용이 가능: 항상 같은 값을 갖는 필드
//    static final 키워드 생략 가능(원래 상수가 되려면 static final 키워드를 선언해야하는데)
    String name = "Phone";
    //    인터페이스는 추상메소드에 public과 abstact를 생략 가능
    void callPhone(String phoneNumber);
    public abstract void receivePhone(String phoneNumber);

}