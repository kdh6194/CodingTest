package GrmAns;
import java.util.Scanner;
public class grm15Ans {
    public static void main(String[] args) {
        // 구구단
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 두개 입력하시오.");
        int n = sc.nextInt();

            for (int i = 1; i < 10; i++) {
               System.out.println(n+"*"+i+"="+(n*i));
            }

    }
}
