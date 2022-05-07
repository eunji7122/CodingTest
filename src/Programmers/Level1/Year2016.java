package Programmers.Level1;

// 2016기
public class Year2016 {
    public static void main(String[] args) {
        solution(5, 24);
    }

    public static String solution(int a, int b) {
        int days = 0;

        if (a != 1)
        {
            for (int i = 1; i < a; i++) {
                if (i == 2)
                    days += 29;
                else if (i <= 7) {
                    if (i % 2 == 0)
                        days += 30;
                    else
                        days += 31;
                } else {
                    if (i % 2 == 0)
                        days += 31;
                    else
                        days += 30;
                }
            }
        }

        days += b;

        int dividedBy7 = days % 7;
        switch (dividedBy7) {
            case 0:
                return "THU";
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
        }
        return "";
    }
}
