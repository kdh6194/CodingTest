package Problem;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        // 해당 월일 입력시 요일 출력 -- 수정 필요
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        int tmp = 0;

        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i=0; i<t-1; i++){
            tmp += date[i];
        }
        tmp += x;
        System.out.println(tmp%7);
        System.out.println(week[tmp%7]);
    }
}
