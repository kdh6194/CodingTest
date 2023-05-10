package GrmAns;

import java.util.Scanner;
public class grm40Ans {
    // 매서드 하나에서 처리하는 코드
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

    //2*n크기의 직사각형을 1*2,2*1타일로 채우는 방법
//        public static int countWays(int n) {
//            int[] dp = new int[n + 1];
//            dp[1] = 1; // 2 * 1 크기의 타일로 채우는 방법은 1가지
//            dp[2] = 2; // 1 * 2 크기의 타일 2개 또는 2 * 1 크기의 타일 2개로 채우는 방법은 2가지
//            for (int i = 3; i <= n; i++) {
//                dp[i] = dp[i - 1] + dp[i - 2];
//            }
//            return dp[n];
//        }
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("n을 입력하세요: ");
//            int n = scanner.nextInt();
//
//            int ways = countWays(n);
//
//            System.out.println(n + " 크기의 직사각형을 1*2, 2*1 타일로 채우는 방법의 수: " + ways);
//        }
//    }
