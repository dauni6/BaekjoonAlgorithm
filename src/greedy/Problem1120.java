package greedy;

import java.io.*;

public class Problem1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문자 입력 받기
        String a = br.readLine();
        String b = br.readLine();



        // 길이가 같아져야만 차이의 갯수를 구할 수 있다
        int cnt = 0;
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) { //차이구하기
                cnt++;
            }
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();


        

    }
}
