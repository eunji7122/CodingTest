package Programmers.Level2;

// 양궁대회
public class ArcheryCompetition {
    static int maxGap = 0;
    static int[] result = new int[]{-1};

    public static void main(String[] args) {
        solution(9, new int[]{10,0,1,2,0,1,1,1,1,1,1});
    }

    public static int[] solution(int n, int[] info) {
        maxGap = 0;
        result = new int[]{-1};
        seekAllCombinations(n, 0, new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, info);
        if (maxGap <= 0)
            return new int[] {-1};
        return result;
    }

    public static void seekAllCombinations(int arrows, int cursor, int[] currentArray, int[] info) {
        if (arrows == 0) {
            int gap = getScoreGap(info, currentArray);
            if (gap > maxGap) {
                maxGap = gap;
                result = currentArray.clone();
            } else if (gap == maxGap && gap > 0) {
                for (int i = currentArray.length - 1; i >= 0; i++) {
                    if (currentArray[i] > result[i]) {
                        result = currentArray.clone();
                        break;
                    } else if (currentArray[i] < result[i]) {
                        break;
                    }
                }
            }
            return;
        }
        for (int i = cursor; i < currentArray.length; i++) {
            if (currentArray[i] > info[i]) {
                continue;
            }
            currentArray[i] += 1;
            seekAllCombinations(arrows - 1, i, currentArray, info);
            currentArray[i] -= 1;
        }
    }

    public static int getScoreGap(int[] info, int[] currentArray) {
        int gap = 0;
        for (int i = 0; i < info.length; i++) {
            int score = 10-i;
            if (info[i] < currentArray[i]) {
                gap += score;
            } else if (info[i] == 0) {

            } else {
                gap -= score;
            }
        }
        return gap;
    }
}
