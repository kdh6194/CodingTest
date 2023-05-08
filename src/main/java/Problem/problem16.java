package Problem;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        // (평균 점수 이사인 학생들 수/총학생)*100
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하세요");
        int num = sc.nextInt();

        int[] n = new int[num];

        int total = 0;
        int avg = 0;

        for(int i =0; i<num;i++){
            System.out.println("학생수 만큼 학생의 평균을 입력하세요");
            n[i] = sc.nextInt();
            total += n[i];
            if(i==num-1){
                avg = total/num;
                System.out.println("평균점수는"+avg+"입니다");
            }
        }
        int g = 0;
        for (int j = 0; j < n.length; j++) {
            if(avg < n[j]){
                g += 1;
            }
        }
        double gn = 0;
        gn = (g*100.0/num);
        System.out.println("평균보다 높은 학생비율"+gn);

    }
}
