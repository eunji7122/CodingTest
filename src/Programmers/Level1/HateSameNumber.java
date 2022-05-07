package Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

// 같은 숫자는 싫어
public class HateSameNumber {
    public static void main(String[] args) {
        solution(new int[]{1, 1, 3, 3, 0, 1, 1});
    }

    public static int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();

        int currentValue = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != currentValue) {
                numList.add(arr[i]);
            }
            currentValue = arr[i];
        }

        return numList.stream().mapToInt(i -> i).toArray();
    }
}
