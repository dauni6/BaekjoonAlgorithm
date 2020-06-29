package bronze5;

import java.io.*;

public class Problem5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        bw.write(sum +"");
        bw.flush();
        br.close();
        bw.close();

    }
}
