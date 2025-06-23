package chapter08.section04;

public class PhoneTest {
    public static void main(String[] args) {
//        Phone phone = new Phone(); //인터페이스는 new 연산자로 객체 생성 불가능
        TelePhone telephone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telephone.answeringMachine("지금은 전화를 받을 수 없습니다. 음성 메시지를 남겨주세요.");
        telephone.callPhone("010-1111-1234");
        telephone.receivePhone("010-2222-1233");

        featurePhone.sendSMS("010-3333-5678", "인터페이스를 배우고 있어요. 아주 많이 사용됩니다.");

        smartPhone.installApp("카카오톡");
    }
}