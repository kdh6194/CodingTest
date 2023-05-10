package GrmAns;

import java.util.Scanner;

public class grm09Ans {
    public static void main(String[] args) {
        // 팩토리얼 출력
        while (true) {
            System.out.println("숫자를 입력하세요.");

            // 입력받는 수
            int a;

            // total값은 for문을 계속 돌려서 곱해야하기때문에 초기값으로 1을 준다.
            int total = 1;

            Scanner scan = new Scanner(System.in);

            a = scan.nextInt();

            // 팩토리얼은 특정한 수를 받으면 1부터 그 숫자까지를 하나씩 곱해서 나오는 수이다.

            // ex)5를 입력받음 , 5! = 1 * 2 * 3 * 4 * 5

            // 1은 곱해봤자 자기랑 같은 수가 나오기 때문에 2부터 시작함 (어차피 초기값도 1로 주었음)
            for (int i = 2; i <= a; i++) {

                total *= i;

            }

            System.out.println("팩토리얼 (!) 정답 : " + a + "! = " + total);

            System.out.println();

        }
    }
}

// 함수형식으로 작성한 팩토리얼

//   // 숫자를 받아서 리턴하는 함수를 생성함
//    public static int function(int number) {
//
//        // 팩토리얼한 수를 저장할 변수
//        int total = number;
//
//        for (int i = 1; i < number; i++) {
//
//            total *= i;
//        }
//
//        return total;
//
//    }
//
//    public static void main(String[] args) {
//
//        // 입력한 수의 팩토리얼 구하기
//
//        // 숫자 입력받기
//
//        System.out.println("숫자를 입력하세요.");
//
//        int number;
//
//        Scanner scan = new Scanner(System.in);
//
//        number = scan.nextInt();
//
//        // 위에서 팩토리얼을 계산한 수를 저장할 변수.
//        int total = function(number);
//
//        System.out.printf("결과 : %d", total);