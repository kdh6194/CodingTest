package GrmAns;

import java.util.Scanner;

public class grm5Ans {
    public static void main(String[] args) {
        //10진수를 2진수로 변환하기
        for(int i = 0; ; i++) {
            System.out.println();
            System.out.println();

            System.out.println("변환할 10진수를 입력하세요.");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();

            System.out.println("내가 입력한 10진수 : "+a);

            int[] arr = new int[50];
            arr[0] = a;

            //10진수를 2진수로 변환할때는 Integer클래스의 API를 활용하면 편하게 변환할 수가 있다.
            String a2 = Integer.toBinaryString(arr[0]);

            System.out.println("10진수를 2진수로 변환한 숫자 : "+a2);
            if(a2.equals("0")){return;}
        }
    }
}
