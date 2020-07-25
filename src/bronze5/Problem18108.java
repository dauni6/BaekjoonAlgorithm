package bronze5;

import java.io.*;

public class Problem18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int bulgi = Integer.valueOf(br.readLine());
        bw.write( bulgi - 543 + "");
        bw.flush();

    }
}
