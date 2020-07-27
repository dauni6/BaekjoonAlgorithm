package bronze4;

import java.io.*;

public class Problem1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //8진수라 가정하고 들어옴 -> 2진수

        String num = br.readLine();

        if (333334 > num.length()){
            int octal = Integer.valueOf(num, 8); //8진수
            int decimal = Integer.valueOf(String.valueOf(octal), 10);
            int binary = Integer.valueOf(String.valueOf(decimal), 2);

            bw.write(binary + "");
            bw.flush();
        }




    }
}
