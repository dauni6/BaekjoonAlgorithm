import java.io.*;

public class Problem10996 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine()); // n == 2 라면?

        for (int i = 0; i < n; i++) { //홀수만
            if (i % 2 != 0) { //홀수
                System.out.print("*");
            }
            System.out.print(" ");
        }

        for (int i = 0; i < n; i++) { //짝수만
            if (i % 2 == 0) {
                System.out.print(" *");
            }
        }

    }
}
