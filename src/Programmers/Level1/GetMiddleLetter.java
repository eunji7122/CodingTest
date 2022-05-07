package Programmers.Level1;

// 가운데 글자 가져오기
public class GetMiddleLetter {
    public static void main(String[] args) {
        solution("qwer");
    }

    public static String solution(String s) {
        int middleNumber = s.length() / 2;
        return s.length() % 2 == 0
                ? s.substring(middleNumber - 1, middleNumber + 1) : s.substring(middleNumber, middleNumber + 1);
    }
}
