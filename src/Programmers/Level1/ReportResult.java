package Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

// 신고 결과 받기
public class ReportResult {
    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        List<User> userList = new ArrayList<>();
        List<String> badUserList = new ArrayList<>();

        for (String s : id_list) {
            userList.add(new User(s));
        }

        // 정보 넣기
        for (int i = 0; i < report.length; i++) {
            String[] info = report[i].split(" ");
            User reportUser = userList.stream().filter(item -> item.Name.equals(info[0])).findFirst().orElse(null);
            User reportedUser = userList.stream().filter(item -> item.Name.equals(info[1])).findFirst().orElse(null);
            if (!reportUser.ReportIdList.contains(info[1])) {
                reportedUser.ReportedNumber = reportedUser.ReportedNumber + 1;
                reportUser.ReportIdList.add(info[1]);
            }
        }

        // 불량 이용자 찾기
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).ReportedNumber >= k) {
                badUserList.add(userList.get(i).Name);
            }
        }

        // 처리 메일을 받은 아이디 찾기
        for (int i = 0; i < userList.size(); i++) {
            for (int j = 0; j < badUserList.size(); j++) {
                if (userList.get(i).ReportIdList.contains(badUserList.get(j))) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    static class User {
        public String Name;
        public int ReportedNumber;
        public List<String> ReportIdList;

        public User(String name) {
            this.Name = name;
            this.ReportedNumber = 0;
            this.ReportIdList = new ArrayList<>();
        }
    }
}
