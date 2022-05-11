package Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

// 폰켓몬
public class Ponkemon {
    public static int solution(int[] nums) {
        List<Integer> newList = new ArrayList<>();
        for (int num : nums) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }

        return Math.min(nums.length / 2, newList.size());
    }
}
