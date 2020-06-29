package bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class Problem3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = {1,1,2,2,2,8}; //기본 체스 구성

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (arr[i] == a) { //값이 같으면
                bw.write(0 + " ");
            } else if (arr[i] > a || arr[i] < a) {
                bw.write(arr[i] - a + " ");
            }
        }

        bw.flush();

    }
}
