package bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class Problem3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int result = (s * 2) - r1;
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
