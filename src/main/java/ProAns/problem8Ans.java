package ProAns;

import java.util.Scanner;

public class problem8Ans {
    public static void main(String[] args) {
        //주어진 정수를 각 자릿수별로 더하는 방법
        Scanner sc = new Scanner(System.in);

        // 정수 입력받기
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        // 각 자릿수별로 더하기
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // 일의 자리 수 더하기
            num /= 10;  // 일의 자리 수 제거
        }

        // 결과 출력
        System.out.println("각 자릿수의 합: " + sum);
    }
}
