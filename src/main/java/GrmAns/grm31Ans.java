package GrmAns;
import java.util.Scanner;
public class grm31Ans {
    //두 수를 받아서 두 수 사이에 값을 더해서 반환할 함수
    public static int function(int num_1, int num_2) {

        //total이란 변수를 만들고 반복문이 회전할 때마다 숫자를 계속 더한 후에 total값을 리턴해준다.
        int total = 0;

        for(int i = num_1; i <= num_2; i++) {

            total += i;

        }

        return total;

    }


    public static void main(String[] args) {




        //두 수를 입력해서 두 수 사이의 합을 구하기

        System.out.println("두 수를 입력하세요.");

        Scanner scan = new Scanner(System.in);

        int num_1 = scan.nextInt();

        int num_2 = scan.nextInt();

        int total = function(num_1,num_2);

        System.out.println("정답 :"+total);


    }
}
