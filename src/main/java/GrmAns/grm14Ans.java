package GrmAns;

import java.util.Scanner;

public class grm14Ans {
    public static void main(String[] args) {
        //숫자를 입력받는다.
        System.out.println("숫자를 입력하세요.");

        int n;

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        // 입력한 숫자에 맞는 크기를 가진 배열을 생성함
        int[][] arr = new int[n][n];





        // 배열안에 값을 넣는 부분
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                arr[j][i] = i + j+ 1 + ( i * j ) ;

            }

        }


        //위에서 넣은 값들을 출력해주는 부분.
        for (int i = 0; i < n; i ++) {

            for (int j = 0; j < n; j ++) {

                System.out.printf("%4d",arr[i][j]);

            }

            System.out.println();

        }
    }
}
