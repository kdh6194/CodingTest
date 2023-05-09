package GrmAns;

import java.util.Scanner;

public class grm25Ans {
    public static void main(String[] args) {
        //N이 주어졌을 때 N사이클의 길이 구하기


        //N입력

        System.out.println("숫자를 입력하세요.");

        int number;



        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();

        //숫자를 따로 저장해놓음 (반복문 탈출할때 사용하기 위함)
        int re_number = number;


        //임시변수
        //일의 자리와 십의자리수를 더한 수가 들어가 있음
        int tmp = 0;


        //최종 사이클의 갯수를 나타내는 변수
        int cnt = 0;

        //최소 1회전사이클을 돌려야 하므로 do while를 사용한다.

        do {

            tmp = re_number / 10 + re_number % 10;

            re_number = re_number % 10 * 10 + tmp % 10;

            cnt++;

        }while(number != re_number);

        System.out.println("사이클의 수: "+cnt);
    }
}
