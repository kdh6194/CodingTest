package GrmAns;

import java.util.Scanner;

public class grm01Ans {
    public static void main(String[] args) {
        // 열개씩 끊어서 출력하기
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        for (int i = 1; i <= arr.length; i++) {
            if(i%10!=0){
                System.out.print(arr[i-1]);
            }else {
                System.out.println(arr[i-1]);
            }
        }

    }
}
