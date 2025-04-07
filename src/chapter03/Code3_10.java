package chapter03;

public class Code3_10 {
    public static void main(String[] args) {
        System.out.println("\n======= 편의점 일일 매출 계산기 =======\n");
//       { 구매 및 판매 내역 }
//        삼각김밥 10개 구입
//        바나나맛 우유 2개 판매
//        도시락 5개 구입
//        도시락 4개 판매
//        콜라 1개 판매
//        새우깡 4개 판매
//        캔커피 5개 판매
        int total = 0;

        total -= 900 * 10;
        total += 1800 * 2;
        total -= 3500 * 5;
        total += 4000 * 4;
        total += 1500;
        total += 2000 * 4;
        total += 1800 * 5;

        System.out.println("Java 편의점 일일 총 매출액: " + total +"원");
    }
}
