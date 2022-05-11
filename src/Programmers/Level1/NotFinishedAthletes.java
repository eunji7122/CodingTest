package Programmers.Level1;

import java.util.Arrays;
import java.util.Objects;

// 완주하지 못한 선수
public class NotFinishedAthletes {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!Objects.equals(participant[i], completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }
}
