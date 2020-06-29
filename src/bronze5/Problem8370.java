package bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class Problem8370 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //n1 비지니스 클래스 n2이코노미 클래스
        //k1은 비니지스 클래스의 좌석수 k2는 이코노미의 좌석수
        int n1 = Integer.parseInt(st.nextToken());
        int k1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int k2 = Integer.parseInt(st.nextToken());

        bw.write((n1 * k1) + (n2 * k2) + "");
        bw.flush();
    }
}
