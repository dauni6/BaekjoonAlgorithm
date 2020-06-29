package bronze5;

import java.io.*;
import java.math.BigInteger;

public class Problem2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        BigInteger plus = a.add(b);
        BigInteger sub = a.subtract(b);
        BigInteger mul = a.multiply(b);

        bw.write(plus + "\n");
        bw.write(sub + "\n");
        bw.write(mul + "\n");
        bw.flush();

    }
}
