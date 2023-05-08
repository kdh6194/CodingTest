package Problem;

import java.util.Scanner;

public class problem10_1 {
    public static void main(String[] args) {
        // 별 찍기 인데 뭔가 잘못 되었음 코드 수정
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<= 2*n-1; i++){
            int b = Math.abs(2*(n-1));
            int a = (2*n - b)/2;

            for (int j = 0; j < b; j++) {
                System.out.println("*");
            }
            for (int j = 0; j < a; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j < b; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
