package Grm;

import java.util.ArrayList;
import java.util.Scanner;

public class grm2 {
    public static void main(String[] args) {
        // 학생정보를 저장하고, 학생이름으로 검색했을때, 학번을 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String no = sc.next();

        ArrayList<String> info = new ArrayList<>();

        String ok = "";

        int i = 0;
        do {
            info.add(name);
            info.add(no);
            System.out.println(info.get(i));
            i++;
            ok = sc.next();
            if(ok.equals("n")){
                return;
            }
        }
        while(ok.equals("y"));

        // do-while문을 잘못사용한 사례
        // do를 다 실행하고 나서 y가 만족해야 출력하는 형식인줄 알았는데
        // do안에 명령문을 하나 실행하고 묻고 하나 실행하고 묻는 형식이 되어버림

    }
}
