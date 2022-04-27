package Programmers.Level1;

import java.util.Arrays;

public class FindKimInSeoul {
    public static void main(String[] args) {
        solution(new String[] {"Jane", "Kim"});
    }

    // 서울에서 김서방 찾기
    public static String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}
