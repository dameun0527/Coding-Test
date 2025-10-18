import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        int y = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println((y%4==0 && y%100!=0) || (y%400==0) ? 1 : 0);
    }
}