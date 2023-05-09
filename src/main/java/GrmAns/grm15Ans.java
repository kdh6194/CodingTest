package GrmAns;
import java.util.Scanner;
public class grm15Ans {
    public static void main(String[] args) {

        System.out.println("숫자를 두개 입력하시오.");

        // 구구단의 범위를 계산할 숫자 두개를 입력받는다 s부터 f까지의 구구단을 계산
        int s;
        int f;

        Scanner scan = new Scanner(System.in);

        s = scan.nextInt();
        f = scan.nextInt();

        System.out.printf("입력: %d %d", s, f);

        System.out.println();

        // 중첩 반복문을 사용해서 s부터 f까지의 구구단을 출력한다.

        // 구구단은 계산할때 9까지 곱한다음 s에 1을 올려서 단수를 올려야 하므로 s에 후증가를 써서 구구단을 계산한다.

        for (int a = s; a <= f; a++) {
            for (int i = 1; i < 10; i++) {

                System.out.printf("%d * %d " + "=" + s * i, s, i);

                System.out.println();

            }

            s++;
            System.out.println();

        }
    }
}
