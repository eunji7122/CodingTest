package Programmers.Level1;

import java.util.Arrays;

// 없는 숫자 더하기
public class AdditionMissingNumber {
     public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (count >= numbers.length || numbers[count] != i)
                answer += i;
            else
                count++;
        }

        return answer;
    }
}
