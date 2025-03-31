package chapter02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        System.out.println("\n\n===   단순 계산기   ===\n\n");
//        2개의 정수 값 입력
        Scanner s = new Scanner(System.in);
        System.out.print("* 첫번째 정수 값 입력:");
        int num1 = s.nextInt();
        System.out.print("* 두번째 정수 값 입력:");
        int num2 = s.nextInt();

//        처리부분(계산)
        int resPlus, resMinus, resMultiply, resDivide, resMod;
        resPlus = num1 + num2;
        resMinus = num1 - num2;
        resMultiply = num1 * num2;
        resDivide = num1 / num2;
        resMod = num1 % num2;

//        출력부분
        System.out.printf("%d + %d = %d\n", num1, num2, resPlus);
        System.out.printf("%d - %d = %d\n", num1, num2, resMinus);
        System.out.printf("%d * %d = %d\n", num1, num2, resMultiply);
        System.out.printf("%d / %d = %d\n", num1, num2, resDivide);
//        System.out.printf("%d mod %d = %d\n", num1, num2, resMod);
        System.out.println(num1+ " % " + num2 +  " = " + resMod);
    }
}
