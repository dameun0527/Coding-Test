import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        int n = 0;
        
        if (x > 0) {
            if (y > 0) n = 1;
            else n = 4;
        } else {
            if (y > 0) n = 2;
            else n = 3;               
        }
        System.out.println(n);
    }
}