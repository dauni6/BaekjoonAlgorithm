package ifmun;

import java.io.*;

public class Problem2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //연도
        int year = Integer.parseInt(br.readLine()); 

        int result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;

        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();


    }
}
