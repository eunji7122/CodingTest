package Programmers.Level1;

public class CaesarCode {
    public static void main(String[] args) {
            solution("Z ", 25);
    }

    // 시저 암호
    public static String solution(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char tmp = (char)(s.charAt(i) + n);
            if (s.charAt(i) == ' ') { // 공백
                stringBuilder.append(' ');
            } else if (Character.isLowerCase(s.charAt(i))) { // 소문자
                stringBuilder.append(tmp > 122 ? (char) ('a' + tmp - 123) : tmp);
            } else { // 대문자
                stringBuilder.append(tmp > 90 ? (char) ('a' + tmp - 91) : tmp);
            }
        }
        return stringBuilder.toString();
    }
}
