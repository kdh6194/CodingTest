package GrmAns;

public class grm07Ans {
    public static void main(String[] args) {
        // 최대 공약수 출력
        int a = 10;

        int b = 15;

        //  두 수 중에 어느수가 클지 알 수 없으므로 small과 big 변수를 만들어
        //  큰 수와 작은 수를 따로 저장해준다.

        int small = 0;
        int big = 0;

        if(a > b){
            big = a;
            small = b;
        }else if (b > a) {
            big = b;
            small = a;
        }

        //gcd는 두수를 각각 나누어서 0이 나오는 수 (공약수)

        int gcd = 1;

        for (int i = 1; i <= small; i++){
            if (big % i == 0 && small % i == 0){
                gcd = i;
            }
        }
        System.out.println("두수의 최대 공약수는 ?"+gcd);
    }
}
