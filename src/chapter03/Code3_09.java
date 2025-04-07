package chapter03;

import java.util.Scanner;

public class Code3_09 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

//        num1 = num1 + num2;
        num1 += num2;
        System.out.println(num1);

        int num = 5;

        int result = 10 * 2 + num++;
        System.out.println(result); //25
        System.out.println(num); //6

        num = 5;
        result = 10 * 2 + ++num;
        System.out.println(result); //26
        System.out.println(num); //6
    }
}
