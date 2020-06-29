import java.io.*;
import java.util.StringTokenizer;

public class Problem2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //상근이가 알고있는 파티 참가자수와 각 신문사의 파티 참가자수의 오차를 구하시오.
        //1제곱미터 당 사람의 수 l, 파티가 열렸던 곳의 넓이 p
        //각 기사에 실려있는 참가자의 수 5개
        //오차 구하기
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int sum = l * p;

        st = new StringTokenizer(br. readLine(), " ");
        while (st.hasMoreTokens()) {
            int news = Integer.parseInt(st.nextToken());
            bw.write(news - sum +" ");
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
