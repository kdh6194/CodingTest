package GrmAns;

import java.util.Scanner;

public class grm27Ans {
    public static void main(String[] args) {
        //진수변환

        //변환시킬 변수와 몇진수로 변환시켜야될지 판단하는 변수를 받아야한다.
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 변수");
        int number = sc.nextInt();
        System.out.println("몇 진수로 변환");
        int n = sc.nextInt();


        //배열 1칸 1칸당 숫자를 하나씩 저장해놓기 위해서 배열을 선언함

        char n_number[] = new char[100];


        int i = 0;
        while (number > 0) {

            //n으로 나눈 나머지를 tmp변수에 저장함

            int tmp = number % n;

            //tmp에 들어간 변수가 10보다 크면 아스키코드표로 인해서 'A'+ 알파가 되서

            //B..C...D이런식으로 char타입으로 변환되어서 저장이 된다.

            if(tmp >= 10 && tmp <= 15) {
                n_number[i] = (char) ('A'+ (tmp-10));

            }
            else {

                n_number[i] = (char) ('0'+tmp);
            }
            number /= n;
            i++;
        }


        for( ; i>=0; i--) {
            System.out.print(n_number[i]);

        }
    }
}
