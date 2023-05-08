package Problem;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        // 이거 뭔가 조금 이상함
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = 0;
        int[] d = new int[11];

        d[0]=1;
        d[1]=1;
        d[2]=2;
        d[3]=4;

        for (int i = 0; i < T; i++) {
            n = sc.nextInt();
            for (int j = 4; j <= n; j++) {
                d[n] = d[j-1]+d[j-2]+d[j-3];
            }
            System.out.println(d[n]);
        }
    }
}
