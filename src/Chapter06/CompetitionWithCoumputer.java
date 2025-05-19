package Chapter06;

import java.util.Scanner;

public class CompetitionWithCoumputer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int computerNum = 0, userNum = 0;

        for (int i = 0; 1 < 10; i++) {
//            1~5의 임의의 숫자
            computerNum = (int)(Math.random() * 5 + 1);
            System.out.print("게임 " +(i+1) + "회: ");
            System.out.print("사용자가 생각하는 숫자 입력(1 ~ 5 사이의 점수:");
            userNum = s1.nextInt();

            if (computerNum == userNum) {
                System.out.println("축하합니다. 제 생각과 일치했어요~");
                break;
            }else {
                System.out.printf("제가 생각한 숫자는 %d (이)였어요~ 아까워요~\n", computerNum);
//                continue;
            }
        }

        System.out.println("즐거우셨나요~게임을 종료합니다.");

        s1.close();
    }
}
