package GrmAns;

import java.util.Scanner;

public class grm12Ans {
    public static void main(String[] args) {

        //ㄹ자 배열을 만들기 위해서 숫자 하나를 입력받는다.

        System.out.println("숫자를 입력하세요.");

        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        //입력받은 n만큼의 행과열을 가진 2차원 배열을 만든다.
        int arr[][] = new int[n][n];


        // n=3일때

        //    1    2    3
        //    6    5    4
        //    7    8    9




        //짝수행일때는 위쪽 for문을 타고 홀수행일때는 아래 for문을 탄다.

        //Why??

        //홀수 행일때는 1 2 3 4 이런식으로 숫자가 증가하고,

        //짝수 행일때는 8 7 6 5 이런식으로 반대 방향으로 숫자가 증가하기 때문에 if문으로 분기를 주어서 다른 for문을 사용해서 값을 변경해주어야 한다.

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {

                    arr[i][j] = i * n + j + 1;

                }
            }else {

                for (int j = n-1; j >= 0; j--) {

                    arr[i][j] = i * n + n - j;

                }

            }
        }



        //위쪽 for문에는 배열안에 값을 집어넣는 것이고, 이쪽 for문은 넣은 값들을 출력하는 for문이다.

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                System.out.printf("%4d", arr[i][j]);

            }

            System.out.println();

        }

    }
}
