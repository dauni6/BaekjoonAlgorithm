package bronze5;

import java.io.*;
import java.math.BigInteger;

public class Problem15740 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        BigInteger a = new BigInteger(input[0]);
        BigInteger b = new BigInteger(input[1]);

        BigInteger result = a.add(b);

        bw.write(result + "");
        bw.flush();

        br.close();
        bw.close();

    }
}
