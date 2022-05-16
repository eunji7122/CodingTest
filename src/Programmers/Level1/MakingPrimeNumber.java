package Programmers.Level1;

// 소수 만들기
public class MakingPrimeNumber {
    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrimeNumber(nums[i] + nums[j] + nums[k]))
                        answer++;
                }
            }
        }

        return answer;
    }

    public static boolean isPrimeNumber(int n) {
         int range = (int)Math.sqrt(n);
         for (int i = 2; i <= range; i++) {
             if (n % i == 0)
                 return false;
         }
        return true;
    }
}
