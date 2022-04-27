package Programmers.Level2;

public class JadenCreation {
    public static void main(String[] args) {
        solution2("a   a   a  ");
    }

    public static String solution(String s) {
        String[] strAry = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String value : strAry) {
            char[] arr = value.toLowerCase().toCharArray();
            if (arr.length > 0)
                arr[0] = Character.toUpperCase(arr[0]);

            stringBuilder.append(new String(arr) + " ");
        }
        String answer = stringBuilder.toString().trim();

        // 문자열 맨 뒤에 공백이 있을 경우 공백 개수만큼 추가
        String[] blankArr = s.split("");
        int blankCount = 0;
        for (int i = blankArr.length - 1; i >= 0; i--) {
            if (blankArr[i].equals(" "))
                blankCount++;
            else
                break;
        }

        for (int i = 0; i < blankCount; i++) {
            answer += " ";
        }

        return answer;
    }

    public static String solution2(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String value : sp) {
            answer += flag ? value.toUpperCase() : value;
            flag = value.equals(" ");
        }

        return answer;
    }
}
