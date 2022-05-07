package Programmers.Level1;

import java.util.Arrays;

// 다트 게임
public class DartsGame {
    public static void main(String[] args) {
        solution("1S*2T*3S");
    }

    public static int solution(String dartResult) {
        int[] scoreArr = new int[3];
        String[] stringArr = dartResult.split("");
//String reg = "([0-9]{1,2}[S|T|D][*|#]{0,1})";

        int score = 0;
        int count = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (Character.isDigit(stringArr[i].charAt(0))) { // 숫자
                if (i > 0 && Character.isDigit(stringArr[i - 1].charAt(0))) {
                    score = Integer.parseInt(score + stringArr[i]);
                } else {
                    if (i != 0) {
                        scoreArr[count++] = score;
                    }
                    score = Integer.parseInt(stringArr[i]);
                }

            } else if (stringArr[i].equals("S")) { // 보너스
                score = (int) Math.pow(score, 1);
            } else if (stringArr[i].equals("D")) { // 보너스
                score = (int) Math.pow(score, 2);
            } else if (stringArr[i].equals("T")) { // 보너스
                score = (int) Math.pow(score, 3);
            } else if (stringArr[i].equals("*")) { // 옵션
                if (count > 0)
                    scoreArr[count - 1] *= 2;
                score *= 2;
            } else if (stringArr[i].equals("#")) { // 옵션
                score *= -1;
            }
        }

        scoreArr[2] = score;
        return Arrays.stream(scoreArr).sum();
    }
}
