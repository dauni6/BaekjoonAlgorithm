import java.io.*;

public class Problem2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        int count = n;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i <= (n - 1)) {
                for (int j = 0; j <= i; j++) {
                    bw.write("*");
                }
            }
            if (i > n - 1) {
                for (int j = count - 1; j > 0; j-- ) {
                   bw.write("*");
                }
                count--;
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
