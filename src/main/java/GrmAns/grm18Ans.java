package GrmAns;
import java.util.Scanner;
public class grm18Ans {
    public static void main(String[] args) {
        // 별 출력2
        //  *
        // **
        //***

        // 숫자를 입력 받기

        System.out.println("숫자를 입력하세요.");

        int number;

        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();

        // 아까와 마찬가지로 중첩반복문을 사용함.

        // if안에 들어갈 내용이 중요함.

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {

                if (i < number - (j + 1)) {

                    System.out.print(" ");

                } else {

                    System.out.print("*");

                }

            }

            System.out.println();

        }
    }
}
