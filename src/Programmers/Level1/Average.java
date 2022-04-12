package Programmers.Level1;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        solution(new int[] {1, 2, 3, 4});
    }

    public static double solution(int[] arr) {
        OptionalDouble answer = Arrays.stream(arr).average();
        return answer.getAsDouble();
    }
}
