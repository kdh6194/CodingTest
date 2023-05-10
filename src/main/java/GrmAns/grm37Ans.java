package GrmAns;
import java.util.Scanner;
public class grm37Ans {
    //입력된 값중에서 가장 큰수를 출력
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("숫자 개수를 입력하세요: ");
            int count = scanner.nextInt();

            int[] numbers = new int[count];

            System.out.println("숫자를 입력하세요:");

            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextInt();
            }

            int max = numbers[0]; // 첫 번째 숫자를 초기 최대값으로 설정

            for (int i = 1; i < count; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("가장 큰 수: " + max);
        }
    }
