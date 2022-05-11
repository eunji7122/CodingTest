package Programmers.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 모의고사
public class MockExam {
    public static int[] solution(int[] answers) {
        int[] person1 = new int[] {1, 2, 3, 4, 5};
        int[] person2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int hitNumber1 = 0;
        int hitNumber2 = 0;
        int hitNumber3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) {
                hitNumber1++;
            }

            if (person2[i % person2.length] == answers[i]) {
                hitNumber2++;
            }

            if (person3[i % person3.length] == answers[i]) {
                hitNumber3++;
            }
        }

        List<Integer> answerList =  new ArrayList<>();
        List<Integer> personList = new ArrayList<>();
        personList.add(hitNumber1);
        personList.add(hitNumber2);
        personList.add(hitNumber3);
        int max = Collections.max(personList);
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i) == max) {
                answerList.add(i + 1);
            }
        }
        Collections.sort(answerList);
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
