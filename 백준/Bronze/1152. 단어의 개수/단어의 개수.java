import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1) 입력 스트림
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        // 2) 앞뒤 공백 제거 → 빈 토큰 방지
        String trimmed = line.trim();

        // 3) 빈 문자열이면 0 반환
        if (trimmed.isEmpty()) {
            System.out.println(0);
            return;
        }

        // 4) split 후 배열 길이 출력
        String[] words = trimmed.split(" ");
        System.out.println(words.length);
    }
}