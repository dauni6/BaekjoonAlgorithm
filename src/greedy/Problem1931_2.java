package greedy;

import java.io.*;
import java.util.Arrays;

public class Problem1931_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            String[] nums = input.split(" ");
            arr[i][0] = Integer.parseInt(nums[0]);
            arr[i][1] = Integer.parseInt(nums[1]);
        }
        Arrays.sort(arr, (arr1, arr2) -> arr1[1] == arr2[1] ? arr1[0]-arr2[0] : arr1[1]-arr2[1]);

        int count = 0;
        int end = -1;

        for(int i=0; i<n; i++) {
            if(arr[i][0] >= end) {
                end = arr[i][1];
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}
