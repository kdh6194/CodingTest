package Problem;

import java.util.Arrays;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        // 배열객체의 최대값,최소값
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num[] = new int[t];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[0]+ " " + num[num.length-1]);
    }
}
