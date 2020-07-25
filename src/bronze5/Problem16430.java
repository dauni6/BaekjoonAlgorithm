package bronze5;

import java.io.*;

public class Problem16430 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.valueOf(input[0]); //2
        int b = Integer.valueOf(input[1]); //7

        int son = b - a;
        bw.write( son + " " + b);
        bw.flush();

        bw.close();
        br.close();
    }
}
