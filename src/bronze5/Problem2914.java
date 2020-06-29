package bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class Problem2914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int result = a * (l - 1) + 1;
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
