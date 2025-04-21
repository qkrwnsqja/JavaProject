package practice05;

import java.util.Scanner;

public class report1_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCredits = 0; // 전체 이수 학점
        double totalPoints = 0.0; // 총 성적 점수

        System.out.print("몇 과목 입력할 건가요?: ");
        int subjectCount = scanner.nextInt();
        scanner.nextLine(); // 버퍼 정리

        for (int i = 1; i <= subjectCount; i++) {
            System.out.println("\n[" + i + "번째 과목 입력]");

            // 과목 이름 입력
            System.out.print("과목 이름: ");
            String subject = scanner.nextLine();

            // 학점 입력
            System.out.print("이수 학점 (숫자만): ");
            int credit = scanner.nextInt();

            // 성적 입력
            System.out.print("성적 (A+, A0, B+, ...): ");
            String grade = scanner.next();
            scanner.nextLine(); // 버퍼 정리

            // 성적을 점수로 환산
            double point = convertGradeToPoint(grade);

            totalCredits += credit;
            totalPoints += credit * point;
        }

        // 평균 계산
        double average = totalPoints / totalCredits;

        System.out.printf("\n📘 전체 평균 평점: %.2f\n", average);

        scanner.close();
    }

    // 성적 문자열을 점수(double)로 바꾸는 함수
    private static double convertGradeToPoint(String grade) {
        // if-else 문으로 처리
        if (grade.equals("A+")) {
            return 4.5;
        } else if (grade.equals("A0")) {
            return 4.0;
        } else if (grade.equals("B+")) {
            return 3.5;
        } else if (grade.equals("B0")) {
            return 3.0;
        } else if (grade.equals("C+")) {
            return 2.5;
        } else if (grade.equals("C0")) {
            return 2.0;
        } else if (grade.equals("D+")) {
            return 1.5;
        } else if (grade.equals("D0")) {
            return 1.0;
        } else if (grade.equals("F")) {
            return 0.0;
        } else {
            // 잘못된 성적 처리
            System.out.println("⚠️ 성적 입력이 잘못되었습니다. 0점으로 처리됩니다.");
            return 0.0;
        }
    }
}
