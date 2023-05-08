package GrmAns;

import java.util.Scanner;

public class grm10Ans {
    public static void main(String[] args) {
        //문제 : 입력된 수의 각 자릿수 합을 구하시오.

        while(true) {

            System.out.println("숫자를 입력하세요.");

            //숫자를 입력받기
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            //각 자릿수를 하나씩 뽑아내야되기 때문에

            //10으로 나눈다음에 그 몫만 계산하면 다음과 같이 한 자리씩 뽑아낼수 있다.

            // 1232 => 123 => 12 => 1
            // 2         3       2    1  => 8

            int total = 0;
            while(number > 0) {
                total += number % 10;

                //10으로 number을 나눠주어서 다음 자릿수로 넘어갈 수 있도록 한다.

                //1234를 입력 받았을 시

                //1234 -> 123 -> 12...
                number /= 10;
            }
            System.out.println("입력된 수의 각 자릿수의 합은? " +total);

            System.out.println();

        }
    }
}
