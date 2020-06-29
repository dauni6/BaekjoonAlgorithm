package bronze5;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(st.nextToken());
            sum += a * a;
            if (i == 4) {  //i == 4일 때 10으로 나눈 몫을 출력하면 된다.
                bw.write(sum%10 + "");
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
