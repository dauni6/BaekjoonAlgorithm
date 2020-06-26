package ifmun;

import java.io.*;
import java.util.StringTokenizer;

public class Problem2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //상근이의 시간
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        m = m - 45;
        if (m < 0) { //음수이면
            h -= 1; //1시간 빼주고
            if (h < 0) {
                h += 24;
            }
            m += 60 ;
        }

        bw.write(h + " " + m);
        bw.flush();
        br.close();
        bw.close();

    }
}
