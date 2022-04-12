package Programmers.Level1;

public class CollatzGuess {
    public static void main(String[] args) {
        solution(6);
    }

    public static int solution(int num) {
        // int 타입으로 계산할 경우 오버플로우 발생
        long number = num;

        for (int i = 0; i < 500; i++) {
            if (number == 1)
                return i;

            number = number % 2 == 0 ? number / 2 : number * 3 + 1;
        }

        return -1;
    }
}
