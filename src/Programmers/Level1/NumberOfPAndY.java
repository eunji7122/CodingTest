package Programmers.Level1;

// 문자열 내 p와 y의 개수
public class NumberOfPAndY {
    public static void main(String[] args) {

    }

    public static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pCount++;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCount++;
            }
        }
        return pCount == yCount;
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
