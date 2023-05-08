package GrmAns;

public class grm4Ans {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2 };
        //배열을 하나 더만들어서 위에 있는 배열의 최빈수와 최빈수가 나온 횟수도 같이 저장한다.
        int[] mode = new int [10];
        //index => 나온 해당 숫자
        //index 값 => index (출현횟수)가 몇번 나왔는지 저장하는 용도
        //"mode[3] = 5, => 3번숫자가, 5번 출현했다."
        for (int i = 0; i < mode.length; i++) {
            mode[arr[i]]++;
        }
        int modeNum = 0;    //최빈수
        int modeCnt = 0;    //최빈수가 나온 횟수

        for (int i = 0; i < mode.length; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수는:"+modeNum+"  "+"횟수는 :"+modeCnt);
    }
}
