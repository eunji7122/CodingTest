package Programmers.Level1;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class PlaceStringInDescendingOrder {
    public static void main(String[] args) {
        solution("Zbcdefg");
    }

    public static String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
