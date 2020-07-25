package bronze5;

import java.io.*;

public class Problem15964 {

    public static void main(String[] args) throws IOException {
        // A@B = (a+b) * (a-b) 치환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long a = Integer.valueOf(input[0]);
        long b = Integer.valueOf(input[1]);
        long at = (a+b) * (a-b);

        bw.write(at + "");
        bw.flush();

    }

}
