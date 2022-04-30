package Programmers.Level1;

// 소수 찾기
public class FindPrimeNumber {
    public static void main(String[] args) {
        solution(5);
    }

    public static int solution(int n) {
        int answer = 1;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = false;
            double range = Math.sqrt(i) + 1;
            for (int j = 2; j < range; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                answer++;
            }
        }

        return answer;
    }
}
