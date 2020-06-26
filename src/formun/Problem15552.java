package formun;

import java.io.*;

public class Problem15552 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                String input = br.readLine();
                String[] nums = input.split(" ");
                int a = Integer.parseInt(nums[0]);
                int b = Integer.parseInt(nums[1]);
                bw.write(a + b + "\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
