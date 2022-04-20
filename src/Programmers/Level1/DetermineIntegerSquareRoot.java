package Programmers.Level1;

public class DetermineIntegerSquareRoot {
    public static void main(String[] args) {
        solution(121);
    }

    public static long solution(long n) {
        long sqrtNumber = (long) Math.sqrt(n);
        return (long)Math.pow(sqrtNumber, 2) == n ? (long)Math.pow(sqrtNumber + 1, 2) : -1;
    }
}
