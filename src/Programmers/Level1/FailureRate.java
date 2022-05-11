package Programmers.Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 실패율
public class FailureRate {
    public static int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> hashMap = new HashMap<>();

        int preCount = 0;
        for (int i = 1; i <= N; i++) {
            int findCount = findAll(i, stages);
            double rate = (double)findCount / (stages.length - preCount);
            preCount += findCount;
            hashMap.put(i, Double.isNaN(rate) ? 0 : rate);
        }

        List<Integer> listKeySet = new ArrayList<>(hashMap.keySet());
        listKeySet.sort((value1, value2) -> (hashMap.get(value2).compareTo(hashMap.get(value1))));

        return listKeySet.stream().mapToInt(i -> i).toArray();
    }

    public static int findAll(int value, int[] list) {
        List<Integer> findList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer == value) {
                findList.add(value);
            }
        }
        return findList.size();
    }
}
