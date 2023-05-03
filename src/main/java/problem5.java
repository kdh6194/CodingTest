import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("#%d ",i);
            if(b>a){
                System.out.println("<");
            }
            if(a==b){
                System.out.println("=");
            }
            if(b<a){
                System.out.println(">");
            }
        }
    }
}
