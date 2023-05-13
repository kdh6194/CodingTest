package GrmAns;

import java.util.Scanner;

public class grm35Ans {

    public static void main(String[] args) {
        // 입력 n에 따른 달팽이 모양의 숫자를 출력

        System.out.println("숫자를 입력하세요.");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // 입력한 숫자 n만큼의 배열을 생성함
        int arr[][] = new int[n][n];

        // 배열의 자표를 나타내는 변수 x,y 생성
        int x = 0;
        int y = 0;

        // 이 숫자는 배열안에 들어갈 출력될 숫자.
        int num = 1;

        // 지금 가는 방향에서 몇번 이동을 할 것인지를 표현하는 변수
        int f = n;

        // 4가 입력되었을 경우에 7번 방향을 바꿔서 이동해야되고, 5가 입력 되었을 경우에는
        // 9번 방향을 바꿔서 이동해야되므로 2*n-1까지 범위를 지정한다.

        // 그리고 i를 4로 나눈 나머지가 어떤 수이냐에 따라서 switch문을 이용해서
        // 위,아래,왼쪽,오른쪽 방향으로 진행방향을 결정해서 숫자를 출력한다.
        for (int i = 0; i < 2 * n - 1; i++) {
            switch (i % 4) {
                case 0: // 오른쪽 이동
                    for (int k = 0; k < f; k++) {
                        arr[y][x] = num;
                        x++;
                        num++;
                    }
                    // 다음에는 y가 1증가해야하므로 y값에 미리 1을 증가시켜 놓는다.
                    // 그리고 x의 값이 n+1까지 이동하게 되므로 x-1을 해준다.
                    x--;
                    y++;

                    // 아까는 5칸 이동했었어야 되었지만 아래방향은 4칸만 이동하면 되므로
                    // f를 1 감소시켜준다.
                    f--;
                    break;

                case 1: // 아래쪽 이동
                    for (int k = 0; k < f; k++) {
                        arr[y][x] = num;
                        y++;
                        num++;
                    }

                    y--;
                    x--;

                    break;

                case 2: // 왼쪽 이동
                    for (int k = 0; k < f; k++) {
                        arr[y][x] = num;
                        x--;
                        num++;
                    }

                    x++;
                    y--;

                    // 아래에서 위로 갈때는 3회만 진행하면 되므로 다시 1을 빼준다.
                    f--;

                    break;

                case 3: // 위쪽 이동
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.printf("%3d", arr[i][j]);

            }
            System.out.println();
        }

    }
}
