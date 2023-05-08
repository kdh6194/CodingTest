package Grm;

import java.util.Scanner;

public class grm8 {
    // 소수를 노리고 작성하면 소수만 체크가 가능하지만
    // 0으로 나누어 떨어지는 수가 입력되어도 소수라고 출력됨
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력된 수가 소수인지 판별하시오");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            if(i != 1 && a%i == 0) {
                System.out.println(i + "는 소수입니다.");
            }
        }
    }
}
