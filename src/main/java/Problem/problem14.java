package Problem;

public class problem14 {
    // 이거 메인메서드 사용해서 작동하게 바꿀것
    public String[] solution(int n, int[] arr1, int[] arr2) {
        if(n<1 || n>16) {
            return null;
        }
    String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
            answer[i] = String.format("%" + n+"%s",answer[i].replace("0"," "));
            answer[i] = String.format("%" + n+"%s",answer[i].replace("1","#"));
        }
return answer;
    }
}
