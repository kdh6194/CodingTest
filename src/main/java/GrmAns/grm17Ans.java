package GrmAns;
import java.util.Scanner;
public class grm17Ans {
    public static void main(String[] args) {
        // 별 출력1
        //***
        // **
        //  *
        System.out.println("숫자를 입력하세요.");

        int number;

        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();

        //중첩반복문을 사용해서 *을 출력함.

        //2행부터 공백도 출력해야하기 때문에 if문을 사용해서 i > j라는 조건을 주어서 공백을 출력한다.

        // 2행은 1열이 공백 3행은 1열과 2열이 공백이기 때문에 i > j 라는 조건을 준다.

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {

                if (i > j) {

                    System.out.print(" ");

                } else {

                    System.out.print("*");

                }

            }

            //열을 다 출력한 후에는 개행을 해주어야 하기 때문에 println으로 개행을 해준다.

            System.out.println();

        }
    }
}
