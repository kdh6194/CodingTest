package GrmAns;

import java.util.Scanner;

public class grm33Ans {
    public static void main(String[] args) {
        //입력된 값에서 중간 값을 출력하는 방법
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("숫자를 입력하세요:");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int middleIndex = count / 2;
        int middleValue;

        if (count % 2 == 0) {
            // 개수가 짝수인 경우
            middleValue = numbers[middleIndex - 1];
        } else {
            // 개수가 홀수인 경우
            middleValue = numbers[middleIndex];
        }

        System.out.println("중간 값: " + middleValue);
    }
}
