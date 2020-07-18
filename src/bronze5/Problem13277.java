package bronze5;

import java.io.*;
import java.math.BigInteger;

public class Problem13277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] split = input.split(" ");

        BigInteger a = new BigInteger(split[0]);
        BigInteger b = new BigInteger(split[1]);

        bw.write(a.multiply(b) + "");
        bw.flush();

        bw.close();
        br.close();

    }
}
