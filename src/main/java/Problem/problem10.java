package Problem;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        // 별 찍기 인데 뭔가 잘못 되었음 코드 수정
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1-N; i < N; i++){
            int a = (N-1) - Math.abs(i);
            int b = (2*N-1) - 2*a;
            for (int j =0; j<a; j++){
                System.out.println(" ");
            }
            for (int j = 0; j<b; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
