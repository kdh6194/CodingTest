package Problem;

import java.util.Arrays;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

// ---------------   스스로 짜본 코드
//        ArrayList<Integer> rs = new ArrayList<>();
//        for(int i =0; i < 10 ; ++i) {
//            int num = sc.nextInt();
//            rs.add(num);
//            System.out.printf(rs.get(i) + " ");
//        }
//
//        int add =0;
//        for (int i =0; i < rs.size(); ++i ){
//            add += rs[i];
//        }
//
//    }
// ---------------   내가 참고해서 만든 코드 // 의도와 맞지않은 코드
        // 입력한 숫자의 합
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] num = new int[10];
        int sum = 0;
        for (int t = 1; t < T; t++) {
            for (int i = 0; i < 10; ++i) {
                num[i] = sc.nextInt();
                if (num[i] % 2 == 1) {
                    sum += num[i];
                }
            }
            System.out.printf(Arrays.toString(num) + " ");
            System.out.println("#"+t+" "+sum);
        }


    }
}
