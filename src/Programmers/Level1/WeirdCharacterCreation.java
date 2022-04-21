package Programmers.Level1;

public class WeirdCharacterCreation {
    public static void main(String[] args) {
        solution(" try hello world ");
    }

    public static String solution(String s) {
        String[] strAry = s.split("");
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String value : strAry) {
            if (value.equals(" ")) {
                stringBuilder.append(value);
                count = 0;
            } else {
                stringBuilder.append(count % 2 == 0 ? value.toUpperCase() : value.toLowerCase());
                count++;
            }
        }
        return stringBuilder.toString();
    }
}
