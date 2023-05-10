package GrmAns;

import java.util.Scanner;
public class grm30Ans {
    // 숫자를 받아서 리턴하는 함수를 생성함
    public static int function(int number) {

        // 팩토리얼한 수를 저장할 변수
        int tot = number;

        for (int i = 1; i < number; i++) {

            tot *= i;
        }

        return tot;

    }
    public static void main(String[] args) {

        // 입력한 수의 팩토리얼 구하기

        // 숫자 입력받기

        System.out.println("숫자를 입력하세요.");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        // 위에서 팩토리얼을 계산한 수를 저장할 변수.
        int total = function(number);

        System.out.printf("결과 : %d", total);

    }
}
