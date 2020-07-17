package bronze5;

import java.io.*;
import java.math.BigInteger;

public class Problem11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String[] split = word.split(" ");
        BigInteger a = new BigInteger(split[0]);
        BigInteger b = new BigInteger(split[1]);
        BigInteger c = new BigInteger(split[2]);

        BigInteger sum = a.add(b).add(c);
        bw.write(sum + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
