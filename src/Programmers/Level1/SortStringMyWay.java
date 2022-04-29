package Programmers.Level1;

import java.util.*;

public class SortStringMyWay {
    public static void main(String[] args) {
        solution(new String[] {"abce", "abcd", "cdx"}, 1);
    }

    // 문자열 내 마음대로 정렬하기
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<String, Character> hashMap = new HashMap<>();

        for (String string : strings) {
            hashMap.put(string, string.charAt(n));
        }

        List<Map.Entry<String, Character>> entryList = new LinkedList<>(hashMap.entrySet());
        entryList.sort(Map.Entry.comparingByKey());
        entryList.sort(Map.Entry.comparingByValue());

        for (int i = 0; i < strings.length; i++) {
            answer[i] = entryList.get(i).getKey();
        }
        return answer;
    }
}
