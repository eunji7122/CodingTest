package Programmers.Level1;

public class SumOfFactor {
    public static void main(String[] args) {
        solution(12);
    }

    // 약수의 합
    public static int solution(int n) {
        int answer = 0;
        int range = n / 2;

        for (int i = 1; i <= range; i++) {
            answer += n % i == 0 ? i : 0;
        }
        answer += n;
        return answer;
    }
}
