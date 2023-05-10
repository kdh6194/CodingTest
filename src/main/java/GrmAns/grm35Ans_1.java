package GrmAns;

import java.util.Scanner;

public class grm35Ans_1 {
    // 달팽이 업그레이드 버전 다이아몬드 형태로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");

        int n = sc.nextInt();
        // 5x5배열
        int[][] A = new int[n+1][n+1]; // 인덱스 1-5 사용
        int C = 1;

        // 전부 공백으로 초기화

        int start = n/2;

        // Math.abs()는 숫자의 절대값을 반환
        // ()의 숫자가 실수면 실수를 출력
        for(int i=-start; i<=start; i++){
            for(int j=Math.abs(i)+1; j< n+1-Math.abs(i); j++){
                A[i+start+1][j] = C++;
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
