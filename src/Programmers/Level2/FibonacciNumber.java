package Programmers.Level2;

// 피보나치 수
public class FibonacciNumber {
    public static void main(String[] args) {
        solution(7);
    }

    public static int solution(int n) {
        int answer = 0;
        int value = 1;

        for (int i = 0; i < n; i++) {
            int tmp = answer + value;
            value = answer % 1234567;
            answer = tmp % 1234567;
        }

        return answer % 1234567;
    }
}
