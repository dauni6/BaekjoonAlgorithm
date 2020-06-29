import java.io.*;
import java.util.StringTokenizer;

public class Problem10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            sum += (score >=40) ? score : 40;
        }
        bw.write(sum/5 + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
