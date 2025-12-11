import java.io.*;

// tip: each public class is put in its own file
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split(" ");

            for (String w : words) {
            String reversed = new StringBuilder(w).reverse().toString();
            System.out.print(reversed + " ");
            }

            System.out.println();

        }
    }
}