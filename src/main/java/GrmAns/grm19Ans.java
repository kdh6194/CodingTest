package GrmAns;
import java.util.Scanner;
public class grm19Ans {
    public static void main(String[] args) {System.out.println("숫자를 입력하세요.");
        // 거듭 제곱 출력

        //n은기본 숫자, m은 제곱할 승의 숫자
        int n = 7;
        int m = 5;

        //최종적으로 계산한 값을 total에 넣는다.
        //아래에서 계산한 값을 계속해서 곱해야하기 때문에 초기값으로 1을 준다.
        int total = 1;

        //i를 1부터 시작해서 계속 1찍 증가시키면서 곱해주면 제곱이 된다.

        for(int i = 1; i < m; i++){

            total *= n;
        }

        System.out.println("정답:"+total);

    }

}

