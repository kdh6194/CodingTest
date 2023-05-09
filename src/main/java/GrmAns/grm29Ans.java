package GrmAns;

import java.util.Scanner;
public class grm29Ans {
    public static void main(String[] args) {
        //숫자 하나를 입력받고, 그 숫자만큼 +와 -를 반복해서 출력하는 구문
        System.out.println("숫자를 입력하세요.");

        int number;

        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();


        //반복문을 사용해서 입력한 숫자만큼 출력되게 함
        for(int i = 1; i <= number; i++) {

            //1보다 크고, 2로 나누어서 나머지가 1이되는 i일때는 -가 앞에 출력 (즉, 홀수일때는 -가 앞에 출력)
            if(i > 1 && i % 2 == 1) {

                System.out.print("-");


                //2로 나누어서 나머지가 0이되는 i일때는 +가 앞에 출력 (즉, 짝수일때는 +가 앞에 출력)
            }else if(i % 2 == 0){

                System.out.print("+");

            }

            System.out.printf("%d"+" ",i);

        }

    }
}
