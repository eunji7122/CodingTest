package Programmers.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 두 개 뽑아서 더하기
public class TwoNumberAddition {
    public static int[] solution(int[] numbers) {
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!answers.contains(sum)) {
                    answers.add(sum);
                }
            }
        }

        Collections.sort(answers);
        return answers.stream().mapToInt(i -> i).toArray();
    }
}
