import java.util.Scanner;

public class problem2 {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int tot =0;
        for(int t = 1; t <= T; t++)
        {
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                tot += num;
            }
            int avg = tot / 10;
            System.out.println("#"+t+" "+avg);
        }
    }
}
