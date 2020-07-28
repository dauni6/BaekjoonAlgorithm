package bronze4;

import java.io.*;

public class Problem2420 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.valueOf(input[0]);
        int m = Integer.valueOf(input[1]);

        if (n < 0) {
            n = -n;
        }
        if (m < 0) {
            m = -m;
        }

        bw.write(n + m + "");
        bw.flush();



    }
}
