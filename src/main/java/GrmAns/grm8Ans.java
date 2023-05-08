package GrmAns;

import java.util.Scanner;

public class grm8Ans {
    public static void main(String[] args) {
        for(int j = 0; ; j++) {
            System.out.println("숫자를 입력하세요.");

            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();

            //소수일경우 boolean변수의 값을 변경해서 표시하게 하려고 초기값은 true값을 준다.
            boolean isPrimnumber = true;

            //1과 자기자신으로만 나누어 떨어지는 수가 소수이기 때문에 2부터 시작하고 자기자신 -1 만큼 i값을 증가시키는 반복문을 돌려서 나누어준다.
            for(int i = 2; i <= a -1; i++) {
                //소수는 1과 자기자신으로만 나누어 떨어지는 수
                if (a % i == 0) {
                    isPrimnumber = false;
                }else if (a % 1 == a && a % a == 1){
                    isPrimnumber = true;
                }
            }

            if (isPrimnumber == false) {
                System.out.println(a+"는 소수가 아닙니다.");
            }else if(isPrimnumber == true) {
                System.out.println(a+"는 소수입니다.");
            }
            System.out.println();
        }
    }
}
