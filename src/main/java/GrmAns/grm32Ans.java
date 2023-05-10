package GrmAns;

public class grm32Ans {
    // 두수를 더한 값이 target과 동일할때 해당 숫자 출력
    static int[] num = {2,7,11,15};
    static int target = 9;
    public static int[] twoSum (int[] num,int target) {
        int i = 0;
        int j = 0;

        for (i =0; i< num.length;i++){
            for (j = 0; j < num.length; j++) {
                if(num[i] + num[j] == target){
                    int min = num[j];
                    int max = num[i];

                    int nindex = j;
                    int xindex = i;

                    System.out.println(num[i]);
                    System.out.println(num[j]);
                    System.out.println("더해서 타겟에 나오는 첫번째값"+min);
                    System.out.println("더해서 타겟에 나오는 두번째값"+max);
                    System.out.println("더해서 타겟에 나오는 첫번째값의 인덱스"+nindex);
                    System.out.println("더해서 타겟에 나오는 두번째값의 인덱스"+xindex);
                }else break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        twoSum(num,target);
    }
}
