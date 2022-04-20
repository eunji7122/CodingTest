package Programmers.Level1;

import java.util.ArrayList;

public class RemoveSmallestNumber {
    public static void main(String[] args) {
        solution(new int[]{4, 1, 3, 2, 1});
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[]{-1};

        ArrayList<Integer> array = new ArrayList<>();

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallest) {
                array.add(arr[i]);
            }
        }

        int[] answer = new int[(int)array.stream().count()];
        for (int i = 0; i < answer.length; i++)
        {
            answer[i] = array.get(i);
        }

        return answer;
    }
}
