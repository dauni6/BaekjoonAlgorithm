package bronze5;

import java.io.*;

public class Problem5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int total = a + b + c + d;

        int min = total/60; //분
        int second = total%60;

        bw.write(min +"\n");
        bw.write(second + "");
        bw.flush();

    }
}
