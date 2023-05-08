package Grm;

import java.util.ArrayList;
import java.util.Scanner;

public class grm4 {
    public static void main(String[] args) {
        // 가장 많이 출현한 수를 출력하시오
        // 1223142243532 -> 정답 : 2
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        int[] n = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};
        int cnt = 0;
        int tot = 0;
        for (int i =0; i<n.length; i++){
            num.add(n[i]);
            if (cnt < num.get(i)) {
                cnt = num.get(i);
            }
        }
        System.out.println("최빈수는"+cnt+"입니다");
    }
}
