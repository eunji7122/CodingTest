package Programmers.Level1;

public class SecretMap {
    public static void main(String[] args) {
        solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String zero = "0";
        for (int i = 0; i < n; i++) {
            String str1 = zero.repeat(n - Integer.toBinaryString(arr1[i]).length()) + Integer.toBinaryString(arr1[i]);
            String str2 = zero.repeat(n - Integer.toBinaryString(arr2[i]).length()) + Integer.toBinaryString(arr2[i]);

            String test = "";

            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '0' && str2.charAt(j) == '0') {
                    test += " ";
                } else {
                    test += "#";
                }
            }
            answer[i] = test;
        }

        return answer;
    }
}
