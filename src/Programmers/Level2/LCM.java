package Programmers.Level2;

public class LCM {
    public static void main(String[] args) {
        solution(new int[] {2, 3, 4});
    }

    public static int solution(int[] arr) {
        if (arr.length == 1)
            return arr[0];

        int lcm = 1;
        for (int k : arr) {
            int range = Math.min(k, lcm);

            int tmp = 0;
            for (int j = 1; j <= range; j++) {
                if (k % j == 0 && lcm % j == 0) {
                    tmp = (k / j) * (lcm / j) * j;
                }
            }
            lcm = tmp;
        }

        return lcm;
    }
}
