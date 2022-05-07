package Programmers.Level1;

// 부족한 금액 계산하기
public class ShortfallCalculation {
    public static void main(String[] args) {

    }

    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += (long) price * i;
        }

        return totalPrice - money > 0 ? totalPrice - money : 0;
    }
}
