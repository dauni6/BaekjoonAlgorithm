package bronze4;

import java.io.*;

public class Problem1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //8진수라 가정하고 들어옴 -> 2진수

        String num = br.readLine();

        if (333334 > num.length()){
            String octal = Long.toOctalString(Long.valueOf(num)); //8진수로 변환
            long oc8 = Long.parseLong(octal);
            String binary = Long.toBinaryString(oc8); //2진수로 변환
            if (!binary.equals("0")) {
                bw.write(binary + "");
                bw.flush();
            }
        }




    }
}
