package chapter05;

import java.util.*;

public class report1_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalScore = 0.0;
        int totalCredits = 0;

        System.out.print("입력할 과목 수를 입력하세요: ");
        int subjectCount = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 제거

        for (int i = 0; i < subjectCount; i++) {
            System.out.println("\n[" + (i + 1) + "번째 과목]");
            System.out.print("과목명: ");
            String subjectName = scanner.nextLine();

            System.out.print("이수학점 (숫자): ");
            int credit = scanner.nextInt();

            System.out.print("성적학점 (A+, A0, B+, ...): ");
            String grade = scanner.next();
            scanner.nextLine(); // 줄바꿈 제거

            double gradePoint = getGradePoint(grade);

            totalScore += credit * gradePoint;
            totalCredits += credit;
        }

        double average = totalScore / totalCredits;
        System.out.printf("\n전체 학점 평균: %.2f\n", average);

        scanner.close();
    }

    private static double getGradePoint(String grade) {
        return switch (grade) {
            case "A+" -> 4.5;
            case "A0" -> 4.0;
            case "B+" -> 3.5;
            case "B0" -> 3.0;
            case "C+" -> 2.5;
            case "C0" -> 2.0;
            case "D+" -> 1.5;
            case "D0" -> 1.0;
            case "F"  -> 0.0;
            default -> {
                System.out.println("⚠️ 유효하지 않은 성적입니다. 0점 처리합니다.");
                yield 0.0;
            }
        };
    }
}
