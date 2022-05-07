package Programmers.Level1;

public class MinimumRectangle {
    public static void main(String[] args) {
        solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }

    public static int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int[] size : sizes) {
            if (size[0] > size[1]) {
                if (width < size[0])
                    width = size[0];
                if (height < size[1])
                    height = size[1];
            } else {
                if (width < size[1])
                    width = size[1];
                if (height < size[0])
                    height = size[0];
            }
        }

        return width * height;
    }
}
