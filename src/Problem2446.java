import java.io.*;

public class Problem2446 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        int junction = 2 * n - 1;
        int count = n - 2;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i <= n - 1) {
                for (int k = 0; k < i; k++) {
                    bw.write(" ");
                }
                for (int j = 0; j < junction; j++) {
                    bw.write("*");
                }
                junction -= 2;
            }
            if (i > n - 1) {  //다시 +2 씩 커져야함
                junction +=2;
                for (int k = 0; k < count; k++) {
                    bw.write(" ");
                }
                count--;
                for (int j = 0; j < junction + 2; j++) {
                    bw.write("*");
                }

            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
