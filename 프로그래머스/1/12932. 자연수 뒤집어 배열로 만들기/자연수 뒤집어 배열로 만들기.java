import java.util.Arrays;

public class Solution {  // 클래스 이름을 Main에서 Solution으로 변경
    public static int[] solution(long n) {
        // 숫자를 문자열로 변환
        String str = Long.toString(n);
        
        // 문자열의 길이만큼 배열 생성
        int[] answer = new int[str.length()];
        
        // 문자열의 뒤에서부터 배열에 숫자를 채움
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        
        return answer;
    }

}   