package GrmAns;

import java.util.Scanner;

public class grm13Ans {
    public static void main(String[] args) {
        // 지그재그형태로 출력하기
        // 달팽이랑 다이아몬드는 ProAns에서 3,3-a,3-b전부 확인
        System.out.println("숫자를 입력하세요.");

        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        //입력받은 숫자만큼의 크기를 가진 배열을 생성함.
        int [][] arr = new int [n][n];

        //아까와는 다르게 열이 고정된 상태에서 행이 변화하는 사각형이다.

        //열고정 행변화이므로 아까와는 다르게 i와 j의 위치를 바꿔서 순서대로 값을 넣어준다.

        //값을 하나씩 넣어주어야 하므로 num이라는 변수를 추가해서 for문이 반복될 때마다 1씩 증가시켜 준다.

        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j< n; j++) {

                arr[j][i] = num;
                num++;
            }

        }


        //배열에 담긴 값들을 출력하는 부분

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.printf("%4d",arr[i][j]);

            }

            System.out.println();

        }
    }
}
