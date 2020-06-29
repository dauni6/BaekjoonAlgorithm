package bronze5;

import java.io.*;
import java.math.BigInteger;

public class Problem1271 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String input = br.readLine();
            String[] nums = input.split(" ");
            BigInteger n = new BigInteger(nums[0]);
            BigInteger m = new BigInteger(nums[1]);

            BigInteger[] bi = n.divideAndRemainder(m);

            bw.write(bi[0] +"\n"); //몫
            bw.write(bi[1] + ""); //나머지
            bw.flush();
            bw.close();
            br.close();


    }
}
