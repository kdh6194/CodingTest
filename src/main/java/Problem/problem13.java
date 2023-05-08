package Problem;

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        //2*n크기의 직사각형을 1*2,2*1타일로 채우는 방법
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];

        t[0]=t[1]=1;
        for (int i =2; i<=n; i++){
            t[i] = t[i-1]+t[i-2];
            t[i] %= 10007;
        }
        System.out.println(t[n]);
    }
}
