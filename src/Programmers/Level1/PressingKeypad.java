package Programmers.Level1;

// 키패드 누르기
public class PressingKeypad {
    public String solution(int[] numbers, String hand) {
        String[] numberArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) numberArr[i] = "00";
            else if (numbers[i] == 2) numberArr[i] = "01";
            else if (numbers[i] == 3) numberArr[i] = "02";
            else if (numbers[i] == 4) numberArr[i] = "10";
            else if (numbers[i] == 5) numberArr[i] = "11";
            else if (numbers[i] == 6) numberArr[i] = "12";
            else if (numbers[i] == 7) numberArr[i] = "20";
            else if (numbers[i] == 8) numberArr[i] = "21";
            else if (numbers[i] == 9) numberArr[i] = "22";
            else numberArr[i] = "31";
        }

        String[] leftHandLocations = new String[numbers.length + 1];
        String[] rightHandLocations = new String[numbers.length + 1];
        String[] usedHand = new String[numbers.length];

        leftHandLocations[0] = "30";
        rightHandLocations[0] = "32";

        int handCount = 1;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i].equals("00") || numberArr[i].equals("10") || numberArr[i].equals("20")) {
                usedHand[i] = "L";
                leftHandLocations[handCount] = numberArr[i];
                rightHandLocations[handCount] = rightHandLocations[handCount - 1];
            } else if (numberArr[i].equals("02") || numberArr[i].equals("12") || numberArr[i].equals("22")) {
                usedHand[i] = "R";
                rightHandLocations[handCount] = numberArr[i];
                leftHandLocations[handCount] = leftHandLocations[handCount - 1];
            } else {
                String[] currentLocationAry = numberArr[i].split("");
                String[] currentLeftLocationAry = leftHandLocations[handCount - 1].split("");
                String[] currentRightLocationAry = rightHandLocations[handCount - 1].split("");

                int leftDistance = Math.abs(Integer.parseInt(currentLeftLocationAry[0]) - Integer.parseInt(currentLocationAry[0]))
                        + Math.abs(Integer.parseInt(currentLeftLocationAry[1]) - Integer.parseInt(currentLocationAry[1]));
                int rightDistance = Math.abs(Integer.parseInt(currentRightLocationAry[0]) - Integer.parseInt(currentLocationAry[0]))
                        + Math.abs(Integer.parseInt(currentRightLocationAry[1]) - Integer.parseInt(currentLocationAry[1]));
                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    usedHand[i] = "L";
                    leftHandLocations[handCount] = numberArr[i];
                    rightHandLocations[handCount] = rightHandLocations[handCount - 1];
                } else {
                    usedHand[i] = "R";
                    rightHandLocations[handCount] = numberArr[i];
                    leftHandLocations[handCount] = leftHandLocations[handCount - 1];
                }

            }
        handCount++;
        }

        return String.join("", usedHand);
    }
}
