package Programmers.Level1;

public class ReturnStringHoldingPattern {
    public static void main(String[] args) {
        solution(3);
    }

    // 수박수박수박수박수박수?
    public static String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i % 2 == 0 ? "수" : "박");
        }
        return stringBuilder.toString();
    }
}
