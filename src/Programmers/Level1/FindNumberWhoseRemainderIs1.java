package Programmers.Level1;

// 나머지가 1이 되는 수 찾기
public class FindNumberWhoseRemainderIs1 {
    public static void main(String[] args) {
        solution(10);
    }

    public static int solution(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 1)
                return  i;
        }
        return 0;
    }
}
