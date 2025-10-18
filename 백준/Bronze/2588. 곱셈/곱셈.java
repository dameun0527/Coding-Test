import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int lastDigit = num2 % 10;
		int secondDigit = (num2 / 10) % 10;
		int firstDigit = num2 / 100;
		
		
		System.out.println(num1 * lastDigit);
		System.out.println(num1 * secondDigit);
		System.out.println(num1 * firstDigit);
		System.out.println(num1 * num2);
		
	}
}