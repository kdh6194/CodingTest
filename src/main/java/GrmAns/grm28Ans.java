package GrmAns;

import java.util.Scanner;

public class grm28Ans {
    public static void main(String[] args) {
        // 음계  --> 정확히 어떻게 동작하는지도 잘 모르겠음

        //숫자를 받고 그 숫자가 아래의 숫자와 일치하면 각각 출력문을 출력하게 하고,
        //아니라면 mixed를 출력하도록 작성함 String이므로 equal로 비교할 예정

        System.out.println("판별할 숫자를 입력하세요.");


        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();


        //입력된 숫자를 판별한 String 변수 두개를 선언
        String chalye = "1 2 3 4 5 6 7 8";

        String de_chalye = "8 7 6 5 4 3 2 1";



        if(number.equals(chalye)) {

            System.out.println("출력: ascending");

            System.out.println();
        }

        else if(number.equals(de_chalye)) {

            System.out.println("출력: descending");

            System.out.println();
        }

        else {//위의 두가지 경우 전부다 해당되지 않을 경우 출력되는 구문

            System.out.println("출력: mixed");

            System.out.println();
        }
    }
}
