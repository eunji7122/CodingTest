package Programmers.Level1;

public class SpacedNumberByN {
    public static void main(String[] args) {
        solution(2, 5);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += x;
            answer[i] = sum;
        }

        return answer;
    }
}
