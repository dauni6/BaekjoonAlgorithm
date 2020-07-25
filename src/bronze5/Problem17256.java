package bronze5;

import java.io.*;

public class Problem17256 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");

        int x = Integer.valueOf(c[2]) - Integer.valueOf(a[0]);
        int y = Integer.valueOf(c[1]) / Integer.valueOf(a[1]);
        int z = Integer.valueOf(c[0]) - Integer.valueOf(a[2]);

        bw.write(z + " " + y + " " + x);
        bw.flush();
    }
}
