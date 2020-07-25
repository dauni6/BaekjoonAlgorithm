package bronze5;

import java.io.*;

public class Problem17496 {
    public static void main(String[] args) throws IOException {
        //자라는데 걸리는 시간 T, 수확한 날 같은 칸에 심을 수 있음
        //심을 수 있는 빈칸 C, 여름의 기간은 N일
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.valueOf(input[0]); //여름일 수
        int t = Integer.valueOf(input[1]); //자라는데 걸리는 시간
        int c = Integer.valueOf(input[2]); // 밭의 칸 수
        int p = Integer.valueOf(input[3]); // 스타후르츠 개당 가격

        int money = 0;
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if(start + t == i) {
                money += p * c;
                start += t;
            }
        }

        bw.write(money + "");
        bw.flush();


    }
}
