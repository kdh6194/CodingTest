package GrmAns;

import java.util.Scanner;

public class grm26Ans {
    public static void main(String[] args) {
        //두개의 숫자를 입력받아서 그 숫자를 뒤집어서 숫자를 비교한 후에 대소를 정해서 출력한다.

        //String타입으로 변환시켜서 인덱스 자리를 교환하던지, 10으로 계속 나누어서 나머지를 이용해

        //자리를 바꾸던지 해서 숫자를 뒤집은 다음 대소를 판별하면 될 거 같다.


        //두개의 숫자를 입력

        System.out.println("두가지의 숫자를 입력하세요.");

        int number_1;

        int number_2;

        Scanner scan = new Scanner(System.in);

        number_1 = scan.nextInt();

        number_2 = scan.nextInt();

        System.out.printf("입력받은 숫자 : %d %d", number_1, number_2);


        //위에서 받은 두개의 숫자를 뒤집은 값을 저장할 String 변수

        //int타입으로 해버리면 값을 저장할때 더해버리기 때문에 String타입으로 저장해 문자열을 더하는 방식으로 받아야 한다.

        //초기값으로 null을 선언하면 다시 int형으로 형변환을 할 때 에러가 발생하기 때문에 공백("")값을 초기값으로 주면 된다.

        String r_number_1 = "";

        String r_number_2 = "";


        //각 숫자를 10으로 나누어서 그 나머지를 다시 r_number변수에 저장하는 식으로 앞 뒤 숫자를 바꾸어서 저장해 주었다.

        for(int i = 0; i < number_1; i++) {

            r_number_1 += number_1 % 10;
            number_1 /= 10;

        }

        for(int j = 0; j < number_2; j++) {

            r_number_2 += number_2 % 10;
            number_2 /= 10;

        }

        System.out.println("");


        //다시 숫자의 대소를 비교해주어야 하기 때문에 int형으로 다시 형변환을 한다.

        number_1 = Integer.parseInt(r_number_1);

        number_2 = Integer.parseInt(r_number_2);

        System.out.print("뒤집은 값 : "+number_1+" "+number_2 );

        System.out.println("");

        //두 수 중에 더 큰 수를 출력

        if (number_1 < number_2) {

            System.out.print("두 숫자 중 더 큰 수 : "+number_2);

        }else if (number_1 > number_2) {

            System.out.print("두 숫자 중 더 큰 수 : "+number_1);

        }
    }
}
