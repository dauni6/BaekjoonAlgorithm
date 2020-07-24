package bronze5;

import java.io.*;

public class Problem15894 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.valueOf(br.readLine());
        /*long sum = 0;
        for (long i = n; i > 0; i--) {
            sum += i * 4;
        }*/

        bw.write(n * 4 + "");
        bw.flush();

    }
}
