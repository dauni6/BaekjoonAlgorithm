package bronze5;

import java.io.*;

public class Problem14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] split = input.split(" ");
        int n = Integer.valueOf(split[0]); //행
        int m = Integer.valueOf(split[1]); //열
        int k = Integer.valueOf(split[2]); //욱제의 관중석 번호

        bw.write(k / m + " " + k % m);

        bw.flush();

    }
}
