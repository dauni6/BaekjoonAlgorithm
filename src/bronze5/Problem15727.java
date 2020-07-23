package bronze5;

import java.io.*;

public class Problem15727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.valueOf(br.readLine());
        int time = 0;

        for (int i = 0; i <= L; i++) {
            if (L >= 5) {
                int quotient = L/5;
                time += quotient;
                L = L%5;
            } else {
                time += 1;
                break;
            }
        }

        bw.write(time+ "");
        bw.flush();

    }
}
