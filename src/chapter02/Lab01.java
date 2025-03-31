package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
//        입력 받는 부분
        Scanner s1 = new Scanner(System.in); //문자열입력
        Scanner s2 = new Scanner(System.in); //숫자입력
        System.out.println("### 복습용 실습1 택배보내기 프로그램 : 다음의 항목을 각각 입력해주세요. ###");
        System.out.print("* 받는 사람: ");
        String name = s1.nextLine();
        System.out.print("* 주소: ");
        String addr = s1.nextLine();
        System.out.print("* 무게(g): ");
        int weight = s2.nextInt();

//        처리 후 출력 부분

//        처리(계산): 1g당 5원
        int price = weight * 5;

//          출력 부분
        System.out.println("** 받는 사람: " + name + "님");
        System.out.println("** 받는 분 주소: " + addr);
        System.out.println("** 배송비 : " + price + "원");



        s1.close();
        s2.close();
    }

}
