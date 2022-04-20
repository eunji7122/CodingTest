package Programmers.Level1;

public class GCFAndLCM {
    public static void main(String[] args) {
        solution(3, 12);
    }
    public static int[] solution(int n, int m) {
        int gcf = 0;
        int lcm = 0;

        if (n > m) {
            for (int i = 1; i <= m; i++) {
                if (n % i == 0 && m % i == 0) {
                    gcf = i;
                    lcm = n * (m / i);
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && m % i == 0) {
                    gcf = i;
                    lcm = i * (n / i) * (m / i);
                }
            }
        }

        return new int[] { gcf, lcm };
    }
}