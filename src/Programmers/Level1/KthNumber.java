package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// k번째 수
public class KthNumber {
    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();
        for (int[] command : commands) {
            int[] newAry = Arrays.copyOfRange(array, command[0] - 1, command[1]);

            Arrays.sort(newAry);
            answerList.add(newAry[command[2] - 1]);
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
