package Grm;

import java.util.Scanner;

public class grm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  /옆에 ""를 쓰면 ""를 출력 할 수 있다.
      //  \를 연속으로 두번사용하면 \를 출력 할 수 있다.
      //  아래와 같은 형식의 아스키 코드를 사용하면 기호 출력 가능
        System.out.println("\u250C\u252C\u2510");
        System.out.println("\u251C\u253C\u2524");
        System.out.println("\u2514\u2534\u2518");
      //  입력받은 숫자,문자,소수를 그대로 출력
        int a = sc.nextInt();
        System.out.println("입력할 숫자");
        System.out.println(a);
        String a1 = sc.nextLine();
        System.out.println("입력할 문자");
        System.out.println(a1);
        Double a2 = sc.nextDouble();
        System.out.println("입력할 소수");
        System.out.println(a2);
      //  c언어에서 처럼 %d를 써서 여러개의 숫자를 출력할 때
        System.out.printf("%d %s %.0f",a,a1,a2);
      //  시간을 입력받아서 출력하기
        //문자열로 받고, ":"를 기준으로 잘라서 사용한다는 뜻이다.
        String t = sc.next();
        String[] time = t.split(":");
        System.out.format("%d:%d", Integer.parseInt(time[0]),Integer.parseInt(time[1]));
        // 배열에 넣고 일부 숫자만 출력하기
        // : 을 기준으로 숫자하나씩을 배열의 한 공간씩에 저장하고, 2번째 공간에 있는 숫자(분) 을 출력한다.
        String[] time1 = t.split(":");
        System.out.format("%d", Integer.parseInt(time1[1]));
        //%뒤에 02를 붙이면 앞에 두자리까지 출력되게됨 7의 경우에는 앞에 0이 생략되어 있으므로 0까지 같이 출력되게 됨.
        System.out.format("%02d-%02d-%d", Integer.parseInt(time[2]), Integer.parseInt(time[1]), Integer.parseInt(time[0]));
        //소수점 11자리까지만 출력
        System.out.format("%.11f", a2);

//        각종 진수 변환 (2진주, 8진수, 16진수) -
//
//                Integer 클래스의 함수를 사용해서 변환한다.
//
//        Integer 클래스의 toBinaryString, toOctalString, toHexString 함수를 사용하면
//
//        각각 2진수, 8진수, 16진수로 변환이 가능합니다.

        int i = 110;

        String binaryString = Integer.toBinaryString(i);     //2진수로 변환
        String octalString = Integer.toOctalString(i);        //8진수로 변환
        String hexString = Integer.toHexString(i);            //16진수로 변환

        System.out.println("원래 i의 값 : "+i);
        System.out.println("2진수로 변환한 값 : " +binaryString);        //127을 2진수로 변환한값을 출력
        System.out.println("8진수로 변환한 값 : " +octalString);        //127을 8진수로 변환한값을 출력
        System.out.println("16진수로 변환한 값 : " +hexString);        //127을 16진수로 변환한 값을 출력



        System.out.println("=================================================================");
        //=================================================================

        int binaryToDecimal = Integer.parseInt(binaryString, 2);    //2진수를 10진수로 변환한 값을 저장
        int binaryToOctal = Integer.parseInt(octalString, 8);        //8진수를 10진수로 변환한 값을 저장
        int binaryToHex = Integer.parseInt(hexString, 16);            //16진수를 10진수로 변환한 값을 저장

        System.out.println("2진수를 10진수로 변환한 값 : " +binaryToDecimal);        //2진수를 10진수로 변환한 값을 출력함
        System.out.println("8진수를 10진수로 변환한 값 : " +binaryToOctal);            //8진수를 10진수로 변환한 값을 출력함
        System.out.println("16진수를 10진수로 변환한 값 : " +binaryToHex);            //16진수를 10진수로 변환한 값을 출력함

    }
}
