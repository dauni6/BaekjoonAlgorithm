package bronze5;

import java.io.*;

public class Problem14645 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String condition = br.readLine();
        String[] split = condition.split(" ");
        int n = Integer.valueOf(split[0]);
        int k = Integer.valueOf(split[1]);
        int sum = 0;
        sum += k;
        for (int i = 0; i < n; i++) {
            String condition2 = br.readLine();
            String[] split2 = condition2.split(" ");
            int in = Integer.valueOf(split2[0]);
            int out = Integer.valueOf(split2[1]);
            sum += in - out;
        }

        sum -= sum;
        bw.write("비와이");
        bw.flush();

    }
}
