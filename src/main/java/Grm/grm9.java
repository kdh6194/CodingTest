package Grm;

import java.util.Scanner;

public class grm9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();
        int n = 0;
        for (int i =1; i <= f; i++){
            f *= i;
            n = f;
        }
        System.out.println(n);
    }
}
