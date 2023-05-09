package GrmAns;

import java.util.Scanner;

public class grm16Ans {
    public static void main(String[] args) {
        //입력된 숫자의 갯수를 출력받아야 하므로 숫자를 입력받는다.

        System.out.println("숫자를 입력하세요.");


        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        System.out.println("입력 : "+n);

        System.out.println();


        int arr[] = new int[10];

        //0 ~9 까지의 입력된 수를 카운트하기 위한 용도의 배열

        //배열의 한칸한칸마다 숫자를 하나씩 넣어야 된다.

        //숫자를 하나씩 추출할때는 10으로 나눈다음 나머지를 하나씩 배열에 넣는식으로 계산한다.

        //그리고 한바퀴 돌때마다 n을 10으로 나눈만큼 계속 감소시켜서 나머지들을 하나씩 구한다.

        //ex 4232입력 -> 2
        //    423 -> 3
        //    42 -> 2...

        while (n > 0) {

            arr[n % 10]++;

            n /= 10;
        }


        for (int i = 0 ; i < 10; i++) {

            System.out.println(i+":"+arr[i]);
        }
    }
}
