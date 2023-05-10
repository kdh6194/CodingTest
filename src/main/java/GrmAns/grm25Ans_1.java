package GrmAns;

import java.util.Scanner;

public class grm25Ans_1 {
    public static int calculateCycleLength(int n) {
        int initialNumber = n;
        int cycleLength = 0;

        do {
            int unitsDigit = n % 10; // 일의 자리 숫자
            int tensDigit = (n / 10) % 10; // 십의 자리 숫자

            int sum = unitsDigit + tensDigit;
            n = (unitsDigit * 10) + (sum % 10);

            cycleLength++;
        } while (n != initialNumber);

        return cycleLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cycleLength = calculateCycleLength(n);

        System.out.println(n + "의 숫자 사이클 길이: " + cycleLength);
    }
}
