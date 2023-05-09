package GrmAns;

import java.util.Scanner;

public class grm21Ans {
    public static void main(String[] args) {
        // 내가 입력한 값이 들어있으면 true를 리턴하는 arr배열을 생성
        boolean arr[] = new boolean[101];

        Scanner scan = new Scanner(System.in);

        int inArr[] = new int[101];

        // 배열안에 값들을 넣어준다.

        inArr[0] = 1;

        inArr[1] = 2;

        inArr[2] = 2;

        inArr[3] = 9;

        inArr[4] = 9;

        inArr[5] = 66;

        inArr[6] = 92;

        // inArr에 값이 들어있다면 arr배열에 해당되는 inArr인덱스안의 값에 true를 넣어준다.
        for (int i = 0; i <= 100; i++) {

            // inArr[i]의 값이 한번이라도 나왔다는 의미에서 true를 넣어준다.
            arr[inArr[i]] = true;

        }

        for (int i = 1; i <= 100; i++) {
            if (arr[i]) {

                System.out.print(i + " ");

            }

        }
    }
}
