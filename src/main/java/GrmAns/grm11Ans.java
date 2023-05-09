package GrmAns;

import java.util.Scanner;

public class grm11Ans {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");

        int inputnum;

        Scanner scan = new Scanner(System.in);

        inputnum = scan.nextInt();

        //만약 inputnum = 3 입력시

        // 1 2 3
        // 4 5 6
        // 7 8 9

        // 3행 3열 출력

        //행을 반복하는 반복문과 열을 반복하는 반복문이 필요하므로 중첩 반복문이 필요하다.


        //각 행렬마다 들어갈 숫자를 num변수로 지정한다.
        int num = 1;

        for (int j = 0; j < inputnum; j++) {

            for (int i = 0; i < inputnum; i++) {

                //%옆에 숫자는 해당 숫자만큼 칸을 떨어뜨려서 보기좋게 만들때 사용한다.
                System.out.printf("%4d", num);

                //num을 하나씩 증가시키면 1씩 증가한 숫자가 계속 들어가게 된다.
                num++;

            }

            System.out.println();

        }
    }
}
