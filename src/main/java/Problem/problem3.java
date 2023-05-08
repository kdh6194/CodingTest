package Problem;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        // 입력 n에 따른 달팽이 모양으로 숫자 출력하기
        // 이차원 배열을 사용해야됨
        // if문으로는 break가 안되서 switch문으로 작성해야한다.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // 입력한 숫자 만큼의 이차원 배열을 생성
        int arr[][] = new int[t][t];
        // 배열의 좌표를 나태내는 변수 생성
        int x = 0;
        int y = 0;
        // 배열안에 들어갈 숫자
        int num = 1;
        // 가는 방향의 이동 횟수를 나타내는 변수 생성
        int f = t;

        for (int i = 0; i < 2*t-1; i++) {
            switch (i%4){
                case 0:
                    for(int k=0; k<f; k++){
                        arr[y][x] = num;
                        x++;
                        num++;
                    }
                    x--;
                    y++;
                    f--;
                    break;
                case 1:
                    for(int k=0; k <f; k++){
                        arr[y][x] = num;
                        y++;
                        num++;
                    }
                    y--;
                    x--;
                    break;
                case 2:
                    for (int k = 0; k < f; k++) {
                        arr[y][x] = num;
                        x--;
                        num++;
                    }
                    x++;
                    y--;
                    f--;
                    break;

                case 3:
                    for (int k = 0; k < f; k++) {
                        arr[y][x] = num;
                        y--;
                        num++;
                    }
                    y++;
                    x++;

                    break;

            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {

                System.out.printf("%3d", arr[i][j]);

            }
            System.out.println();
        }

    }
}
