package formun;

import java.io.*;
import java.util.StringTokenizer;

public class Problem2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tz = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tz.nextToken());

        for (int i = 1; i <= 9; i++ )
            bw.write(n + " * " + i + " = " + n * i + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
