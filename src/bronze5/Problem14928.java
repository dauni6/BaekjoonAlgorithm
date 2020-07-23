package bronze5;

import java.io.*;
import java.math.BigInteger;

public class Problem14928 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        long remain = 0;
        for(int i = 0; i < N.length(); i++){
            remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        bw.write(remain + "\n");

        bw.close();
        br.close();

    }
}
