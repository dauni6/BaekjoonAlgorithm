package whilemun;

import java.io.*;
import java.util.Scanner;

public class Problem1110_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a, b, bTmp = 0;
        int cnt = 0;
        a = n/10; //첫번째자리 수
        b = n%10; //두번째자리 수

        while (true) {
            cnt++;
            bTmp = b;
            b = (a + b)%10; //두 수의 합의 가장 오른쪽 자리 숫자
            a = bTmp;
            if (n == a * 10 + b) break;
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
       

    }
}
