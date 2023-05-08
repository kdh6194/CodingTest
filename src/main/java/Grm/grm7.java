package Grm;

public class grm7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int[] aa = new int[4];
        int[] bb = new int[4];
        for (int i = 1; i <= 10; i++) {
            if(a%i == 0) {
                System.out.printf("%d ",i);
            }
        }
        for (int i = 1; i <= 15; i++) {
            if(b%i == 0){
                System.out.printf("%d ",i);
            }
        }

    }
}
