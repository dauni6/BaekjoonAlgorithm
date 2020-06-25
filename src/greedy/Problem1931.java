package greedy;

import java.io.*;

public class Problem1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //전체 회의 수
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2]; //n행, 2열
        
        //시간 입력
        for (int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][0] = Integer.parseInt(br.readLine());
        }

        

    }
}
