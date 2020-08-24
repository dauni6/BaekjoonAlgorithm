import java.io.*;

public class Problem10996 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine()); // n == 2 라면?
        for (int k = 0; k < n; k++) { //전체 반복
            for (int i = 1; i <= n; i++) {
                if (i%2 != 0) { //홀수
                    bw.write("* ");
                }
            }

            bw.write("\n");

            for (int i = 1; i <= n; i++) {
                if (i%2 == 0) {
                    bw.write(" *");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
