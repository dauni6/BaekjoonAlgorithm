package bronze5;

import java.io.*;
import java.math.BigInteger;

public class Problem8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //전체 사과 수
        BigInteger n = new BigInteger(br.readLine());
        // 두 소녀가 가지고 있는 사과의 차이
        BigInteger diff = new BigInteger(br.readLine());

        BigInteger one = n.add(diff).divide(BigInteger.valueOf(2));
        BigInteger two = n.subtract(diff).divide(BigInteger.valueOf(2));
        bw.write(one +"\n");
        bw.write(two + "");
        bw.flush();

    }
}
