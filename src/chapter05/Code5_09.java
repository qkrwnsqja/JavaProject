package chapter05;

import java.util.Calendar;

public class Code5_09 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK); //0~6

        System.out.println("현재요일 번호: " + day);
        char dayCh = 0;

        switch (day) {
            case Calendar.SUNDAY: dayCh = '일';
            break;
            case Calendar.MONDAY: dayCh = '월';
            break;
            case Calendar.TUESDAY: dayCh = '화';
                break;
            case Calendar.WEDNESDAY: dayCh = '수';
                break;
            case Calendar.THURSDAY: dayCh = '목';
                break;
            case Calendar.FRIDAY: dayCh = '금';
                break;
            case Calendar.SATURDAY: dayCh = '토';
                break;
        }

        System.out.println("오늘은 " + dayCh + "요일입니다.");
    }
}
