package Problem;

import java.util.Arrays;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        //주어진 정수를 각 자릿수별로 더하는 방법  -- 미완
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] rs = new int[t];
        int[] copy = Arrays.copyOfRange(rs,0,t);
        for(int num : copy){
            System.out.println(num);
        }
    }
}
