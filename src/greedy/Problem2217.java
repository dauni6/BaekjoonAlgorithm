package greedy;

import java.io.*;
import java.util.Arrays;

public class Problem2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //n개의 로프
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        //n개의 로프가 버틸 수 있는 각각의 최대 중량
        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        //물체의 중량
        int w = Integer.parseInt(br.readLine());
    
        //물체의 최대 중량
        int max = 0;
        



    }
}
