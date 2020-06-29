package bronze5;

import java.io.*;

public class Problem1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hex = Integer.valueOf(br.readLine(), 16);
        int decimal = Integer.valueOf(String.valueOf(hex), 10);
        bw.write(decimal +"");
        bw.flush();
        bw.close();
        br.close();
    }
}
