import java.io.*;
import java.util.logging.Logger;

public class Problem10996 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine()); // n == 2 라면?
        for (int k = 0; k < n; k++) { //전체 반복
            //1부터 시작해야되는 이유는 i를 0부터 하게되면 시작부터 짝수로 시작하게 된다.
            //문제도 별 하나부터 시작하기 때문에 출발을 i를 1부터 해줘야 홀수부터 시작 할 수 있다.
            for (int i = 1; i <= n; i++) {
                if (i%2 != 0) { //홀수
                    bw.write("* ");
                }
            }

            bw.write("\n");

            for (int i = 1; i <= n; i++) {
                if (i%2 == 0) { //짝수
                    bw.write(" *");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}