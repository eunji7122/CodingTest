package Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class SortIntegerDescendingOrder {
    public static void main(String[] args) {
        solution(118372);
    }

    public static long solution(long n) {
        String[] ary = String.valueOf(n).split("");
        Arrays.sort(ary, Collections.reverseOrder());

        StringBuilder answerStr = new StringBuilder();
        for (String s : ary) {
            answerStr.append(s);
        }
        return Long.parseLong(answerStr.toString());
    }
}
