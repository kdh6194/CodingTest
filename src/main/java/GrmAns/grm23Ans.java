package GrmAns;

import java.util.Scanner;

public class grm23Ans {
    public static void main(String[] args) {
        // 문지열 뒤집기
        // 배열 값 입력하기
        System.out.println("문자열을 입력하세요.");

        String []a = new String[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < a.length;i++) {
            a[i] = scan.next();
        }
        System.out.println();

        //입력된 값을 확인하는 부분
        for (int c = 0; c < a.length; c++) {
            System.out.print("입력된 값 : "+a[c]+" ");
        }
        System.out.println();

        //출력부분
        //뒤쪽 인덱스부터 차례로 거꾸로 출력한다.


        //-1을 하는 이유는 공백이 하나 들어있기 때문.
        for (int j = a.length-1; j >= 0; j--) {
            System.out.print("뒤집은 값 : "+a[j]+" ");
        }
        System.out.println();


        //아래는 String문자열을 처음에 지정한 후에 위치를 바꾸어서 출력해본것

        String q = "ABCDE";

        System.out.println("String : " +q);

        for(int a_1 = q.length()-1; a_1 >= 0 ; a_1--) {
            System.out.print("String 뒤집은 값 : "+q.charAt(a_1));
        }
    }
}
