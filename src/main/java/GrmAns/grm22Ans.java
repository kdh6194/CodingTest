package GrmAns;

import java.util.Scanner;

public class grm22Ans {
    public static void main(String[] args) {
        // 입력된 수가 팰린드롬인지 판별
        // 팰린드롬이란 ??앞으로 읽던, 뒤에서 부터 읽던 같은 단어

        //int 타입은 정수타입이기 때문에 인덱스가 없어서 판별하기 힘드므로 String 타입을 사용한다.

        System.out.println("판별할 문자나 숫자를 입력하시오.");

        String n;

        Scanner scan = new Scanner(System.in);

        n = scan.nextLine();

        int len = n.length();

        //flag는 팰린드롬이면 그대로 true로 출력이 되고 아래 for문을 돌려서 if문에 해당이 되서
        //팰린드롬이 아니라면 false가 출력되어서 팰린드롬을 판별할 수 있다.

        boolean  flag = true;


        //궂이 끝까지 갈필요 없이 중간까지만 가면 되므로 len/2를 해준다.

        for (int i = 0; i < len/2; i++) {

            //if문의 좌항은 0번째 인덱스항 부터 계속 증가하면서 한칸씩 이동하고
            //우항은 끝쪽에 있는 인덱스항부터 계속 감소하면서 내려온다.
            //두 개의 값을 비교해서 서로 한번이라도 다르면 팰린드롬이 되지 못하므로,
            //flag에 false값을 주고, 출력하면 팰린드롬인지 아닌지 알 수 있다.

            if (n.charAt(i) != n.charAt(len-i-1)) {

                flag = false;

            }

        }

        System.out.println(flag);
    }
}
