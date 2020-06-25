package greedy;

import java.io.*;

public class Problem5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cost = Integer.parseInt(br.readLine());
        int otsuri = 0;
        cost = 1000 - cost;
        //나머지
        // 500엔, 100엔, 50엔, 10엔, 5엔, 1엔
        int[] coins = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < coins.length; i++) {
            otsuri += cost/coins[i]; //몫
            cost = cost%coins[i]; //나머지
        }

        bw.write(otsuri+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
