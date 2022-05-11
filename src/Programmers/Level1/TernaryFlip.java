package Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

// 3진법 뒤집기
public class TernaryFlip {
    public static int solution(int n) {
        int answer = 0;

        List<Integer> ternaryList = new ArrayList<>();
        while (n != 0) {
            ternaryList.add(n % 3);
            n /= 3;
        }

        for (int i = 0; i < ternaryList.size(); i++) {
            answer += ternaryList.get(i) * Math.pow(3, ternaryList.size() - 1 - i);
        }

        return answer;
    }
}
