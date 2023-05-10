package ProAns;

import java.io.IOException;

public class problem4Ans {

    public static int getNum(int i) {
        // 369게임 함수형식으로 출력
        //3,6,9가 들어갔을때 카운트 해주는 변수
        int j = 0;

        while (i > 0) {

            //숫자를 한자리씩 계산하기 위해 10으로 나누어서 나머지가 3,6,9와 같으면
            //카운트 변수를 1씩 증가시키고, 다음자리수를
            //계산하기 위해 i를 다시 10으로 나누어준다.

            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                j++;
                i /= 10;

            }

        }

        return j;

    }


    public static void main(String[] str) throws IOException {

        //100까지 3.6.9 게임 진행

        int number = 100;

        for (int i = 1; i <= number; i++) {


            //위에 있는 함수로 계산한 값을 cnt 변수에 저장
            int cnt = getNum(i);

            //cnt가 0이면 3,6,9 중에 숫자가 안들어있다는 것이기 때문에
            //숫자만 출력

            if (cnt == 0) {

                System.out.print(i + " ");

            } else {

                for (int l = 0; l < cnt; l++) {

                    System.out.print("짝");
                }

                System.out.print(" ");

            }
        }
    }
}