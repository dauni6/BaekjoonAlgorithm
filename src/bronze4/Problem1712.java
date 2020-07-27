package bronze4;

import java.io.*;

public class Problem1712 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //손익분기점은 판매량이 고정비용 + 가변비용을 뛰어넘었을 때, 그러나 넘지 않으면 -1을 출력한다.

        String[] input = br.readLine().split(" ");
        int a = Integer.valueOf(input[0]); //매년 고정비용
        int b = Integer.valueOf(input[1]); //노트북 한대 생산 가변비용
        int c = Integer.valueOf(input[2]); //노트북 가격

        if (b>=c) {
            bw.write("-1");
        } else {
            bw.write(a/(c-b) + 1 + "");
        }

        bw.flush();


    }
}
