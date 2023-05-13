package GrmAns;

import java.util.Scanner;

public class grm06Ans {
    public static void main(String[] args) {
        // 대소문자 변환
        System.out.println("문자를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println("내가 입력한 문자 : "+a);


        //String 타입의 메소드인 CharArray 메소드를 사용해서 char타입으로 변환해서 배열에 넣는다.
        //이렇게 하면 배열의 한 요소당 문자를 넣어서 접근할 수 있게 된다.
        char[] arr = a.toCharArray();

        //문자를 하나씩 배열에 넣고, 대문자인지 소문자 인지 확인한 후에 대문자는 소문자로,
        //소문자는 대문자로 변경하면 된다.
        //아스키코드표를 참고하면 소문자의 아스키 코드 (숫자) 범위는 97~122까지 이고, 대문자는 65~90까지이다.

        //즉, 대문자에서 32를 더하면 소문자가 되고, 소문자에서 32를 빼면 대문자로 변경하는 것이 가능하다는 뜻이다.

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 90 ) {
                arr[i] = (char) (arr[i]+32); // 대문자
            }else if(arr[i] >= 97){
                arr[i] = (char) (arr[i]-32); // 소문자
            }
        }
        System.out.print("대 소문자 변환한 문자 출력 : ");
        //변환한 문자를 출력해보기
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
