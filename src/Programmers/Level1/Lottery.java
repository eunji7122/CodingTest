package Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

// 로또의 최고 순위와 최저 순위
public class Lottery {
    public static void main(String[] args) {
        solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19});
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> lottoList = new ArrayList<>();
        for (int i : lottos)
            lottoList.add(i);
        List<Integer> winNumList = new ArrayList<>();
        for (int i : win_nums)
            winNumList.add(i);

        int matchCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < lottoList.size(); i++) {
            if (winNumList.contains(lottoList.get(i))) {
                matchCount++;
            }
            if (lottoList.get(i) == 0) {
                zeroCount++;
            }
        }

        int maxGuessNumber = 7 - (matchCount + zeroCount);
        int minGuessNumber = 7 - Math.max(matchCount - zeroCount, matchCount);

        return new int[] {maxGuessNumber > 6 ? 6 : maxGuessNumber, minGuessNumber > 6 ? 6 : minGuessNumber};
    }
}
