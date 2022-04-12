package Programmers.Level1;

public class HashadNumber {
    public static void main(String[] args) {
        solution(10);
    }

    public static boolean solution(int x) {
        boolean answer = true;
        String[] strings = String.valueOf(x).split("");
        int sum = 0;
        for (int i = 0; i < strings.length; i++)
        {
            sum += Integer.parseInt(strings[i]);
        }
        return x % sum == 0;
    }
}
