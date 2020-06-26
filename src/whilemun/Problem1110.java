package whilemun;

import java.io.*;

public class Problem1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        if (Integer.parseInt(n) < 10) {
            n = n + "0";
        }
        String nx = "";
        int cnt = 0;
        while (!n.equals(nx)) {
            int a;
            int b;
            if (cnt == 0) {
                 a = n.charAt(0) - 48; //1번째 자리
                 b = n.charAt(1) - 48; //2번째 자리
            } else {
                a = nx.charAt(0) - 48; //1번째 자리
                b = nx.charAt(1) - 48; //2번째 자리
            }

            int sum = a + b;
            String g = String.valueOf(sum);
            int v;
            if (g.length() == 1) {
                v = g.charAt(0) - 48;
            } else {
                v = g.charAt(1) -48;
            }
            nx = b + "" +v;
            cnt++;
        }

        bw.write(cnt+"");
        bw.flush();

    }
}
