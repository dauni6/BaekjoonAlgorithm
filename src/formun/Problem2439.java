package formun;

import java.io.*;

public class Problem2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int k = i; k < n - 1; k++) {
                bw.write(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
