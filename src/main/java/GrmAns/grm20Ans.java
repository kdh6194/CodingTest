package GrmAns;
import java.util.ArrayList;
import java.util.Scanner;
public class grm20Ans {
    public static void main(String[] args) {
        // 369게임 출력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <= t; i++) {
            num.add(i);
            if (i%10 == 3 || i%10 == 6 || i%10 == 9 ) {
                System.out.println("짝");
                continue;}
            System.out.printf("%d",num.get(i));
        }
    }
}
