package Grm;

import java.util.Scanner;

public class grm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i =0; i<10; i++){
            System.out.println(n);
            sum += n;
        }

        System.out.println(sum);
    }
}
