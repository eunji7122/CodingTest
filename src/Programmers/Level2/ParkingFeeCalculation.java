package Programmers.Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 주차 요금 계산
public class ParkingFeeCalculation {
    public static int[] solution(int[] fees, String[] records) {
        List<CarInfo> carList = new ArrayList<>();

        for (String record : records) {
            String[] info = record.split(" ");
            CarInfo carInfo = carList.stream().filter(item -> item.CarNumber.equals(info[1])).findAny().orElse(null);

            if (carInfo == null) { // 기존에 등록되지 않은 차
                carList.add(new CarInfo(info[0], info[1], true));
            } else { // 기존에 등록된 차
                CarInfo findCarInfo = carList.get(carList.indexOf(carInfo));
                if (info[2].equals("IN")) { // 입차
                    findCarInfo.IsEntrance = true;
                    findCarInfo.RecordTime = info[0];
                } else { // 출차
                    findCarInfo.IsEntrance = false;
                    findCarInfo.CumulativeTime += CalculateCumulativeTime(findCarInfo.RecordTime.split(":"), info[0].split(":"));
                }
            }
        }

        Collections.sort(carList);
        int[] answer = new int[carList.size()];

        // 요금 계산
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).IsEntrance) {
                int cumulativeTime = carList.get(i).CumulativeTime
                        + CalculateCumulativeTime(carList.get(i).RecordTime.split(":"), new String[]{"23", "59"});
                answer[i] = (int)CalculateFee(cumulativeTime, fees);
            } else {
                answer[i] = (int)CalculateFee(carList.get(i).CumulativeTime, fees);
            }
        }

        return answer;
    }

    public static int CalculateCumulativeTime(String[] entranceTime, String[] exitTime) {
        return (Integer.parseInt(exitTime[0]) * 60 + Integer.parseInt(exitTime[1]))
                - (Integer.parseInt(entranceTime[0]) * 60 + Integer.parseInt(entranceTime[1]));
    }

    public static double CalculateFee(int cumulativeTime, int[] fees) {
        int calculationTime = cumulativeTime - fees[0];
        return calculationTime > 0 ? Math.ceil((double)calculationTime / fees[2]) * fees[3] + fees[1] : fees[1];
    }

    public static class CarInfo implements Comparable<CarInfo> {
        public String CarNumber;
        public String RecordTime;
        public Boolean IsEntrance;
        public int CumulativeTime;

        public CarInfo(String recordTime, String carNumber, boolean isEntrance) {
            this.CarNumber = carNumber;
            this.RecordTime = recordTime;
            this.IsEntrance = isEntrance;
        }

        @Override
        public int compareTo(CarInfo carInfo) {
            return this.CarNumber.compareTo(carInfo.CarNumber);
        }
    }
}
