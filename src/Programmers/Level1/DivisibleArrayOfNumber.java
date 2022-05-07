package Programmers.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class DivisibleArrayOfNumber {
    public static void main(String[] args) {

    }

    public int[] solution(int[] arr, int divisor) {
        List<Integer> numList = new ArrayList<>();

        for (int j : arr) {
            if (j % divisor == 0) {
                numList.add(j);
            }
        }

        if (numList.stream().count() == 0) {
            numList.add(-1);
        } else {
            Collections.sort(numList);
        }
        return numList.stream().mapToInt(i -> i).toArray();
        // return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }
}
