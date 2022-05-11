package Programmers.Level1;

// 약수의 개수와 덧셈
public class NumberAndAdditionOfFactors {
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int factorCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factorCount++;
                }
            }
            if (factorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }
}
