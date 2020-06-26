package formun;

import java.io.*;

public class Problem11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String input = br.readLine();
            String[] nums = input.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) +"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
