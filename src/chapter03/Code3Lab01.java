package chapter03;

import java.util.Scanner;

public class Code3Lab01 {
    public static void main(String[] args) {
        double lb = 0.453592;
        double kg = 2.204623;
        Scanner s = new Scanner(System.in);

        System.out.print("파운드 (lb)를 입력하세요:");
        int num1 = s.nextInt();
        double result1 = num1 * lb ;
        System.out.printf("%d파운드(lb)는 %.3f kg 입니다.\n", num1, result1);


        System.out.print("킬로그램(kg)를 입력하세요: ");
        int num2 = s.nextInt();
        double result2 = num2 * kg ;
        System.out.printf("%d kg은 %.3f 파운드(lb) 입니다.", num2, result2);

       s.close();
    }
}
