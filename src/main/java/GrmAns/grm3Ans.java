package GrmAns;

import java.util.Scanner;

public class grm3Ans {
    public static void main(String[] args) {
        // 파보나치 수열 : 앞에 두수의 합이 세번째 항의 숫자가 된다.
        //0과 1로 주로 시작하며, 뒤에 있던 수가 앞의 수가 되고, 앞의 수와 뒤의 수를 더한 값이 뒤의 수가 된다.


        Scanner scan = new Scanner(System.in);

        int a = 1, b = 1, temp;
        int i;

        System.out.println("몇번째 항까지 출력할까요??"); i = scan.nextInt();

        for(; i>=1; i--) {
            System.out.print(a+" ");
            temp = a+b; a = b; b = temp;

        }
        System.out.println();
        System.out.println("배열을 사용하는 방법");

        //2번째 방법 (배열을 사용하는 방법)
        //3번째 항부터 공식 (arr[j] = arr[j-1] + arr[j-2];) 이 적용되기 때문에
        //1항과 2항에는 값을 1로 초기화 해주어야 한다.

        int []arr = new int[100];
        arr[1] = 1;
        arr[2] = 1;

        for (int j = 3; j < 10; j++) {
            arr[j] = arr[j-1] + arr[j-2];
        }
        for (int j = 1; j < 10; j++) {
            System.out.print(arr[j]+" ");
        }

    }
}
