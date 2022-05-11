package Programmers.Level1;

import java.util.Arrays;

// 예산
public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int usedBudget = 0;
        Arrays.sort(d);

        for (int j : d) {
            usedBudget += j;
            if (usedBudget > budget) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
