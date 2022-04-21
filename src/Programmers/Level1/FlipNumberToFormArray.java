package Programmers.Level1;

public class FlipNumberToFormArray {
    public static void main(String[] args) {
        solution(12345);
    }

    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        String[] strAry = String.valueOf(n).split("");
        for (int i = strAry.length; i > 0; i--)
        {
            answer[String.valueOf(n).length() - i] = Integer.parseInt(strAry[i - 1]);
        }
        return answer;
    }
}
