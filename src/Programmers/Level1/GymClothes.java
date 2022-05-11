package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 체육복
public class GymClothes {
    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) {
            reserveList.add(i);
        }
        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) {
            lostList.add(i);
        }

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (Objects.equals(reserveList.get(j), lostList.get(i))) {
                    reserveList.remove(reserveList.get(j));
                    lostList.remove(lostList.get(i));
                    i--;
                    break;
                }
            }
        }

        int answer = n - lostList.size();

        for (int j : lostList) {
            if (reserveList.contains(j - 1)) {
                reserveList.remove(Integer.valueOf(j - 1));
                answer++;
            } else if (reserveList.contains(j + 1)) {
                reserveList.remove(Integer.valueOf(j + 1));
                answer++;
            }
        }

        return answer;
    }
}
