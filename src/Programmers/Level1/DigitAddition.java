package Programmers.Level1;

public class DigitAddition {
    public static void main(String[] args) {
        solution(123);
    }

    public static int solution(int n) {
        int answer = 0;
        String[] strAry = String.valueOf(n).split("");

        for (String s : strAry) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
