package Programmers.Level1;

import java.util.Stack;

// 크레인 인형 뽑기
public class CraneDollSelecting {
    public static void main(String[] args) {
        solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    basket.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }

            if (basket.size() >= 2 && basket.get(basket.size() - 1).equals(basket.get(basket.size() - 2))) {
                basket.pop();
                basket.pop();
                answer += 2;
            }
        }

        return answer;
    }
}
