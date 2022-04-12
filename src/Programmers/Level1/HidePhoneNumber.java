package Programmers.Level1;

public class HidePhoneNumber {
    public static void main(String[] args) {
        solution("027777888");
    }

    public static String solution(String phone_number) {
        String answer = "";
        String visibleNumber = phone_number.substring(phone_number.length() - 4);

        for (int i = 0; i < phone_number.length() - 4; i++)
        {
            answer = answer.concat("*");
        }

        answer = answer.concat(visibleNumber);
        return answer;
    }
}
