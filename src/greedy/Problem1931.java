package greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        
        //시간 입력
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) {
              System.out.println(start[0] + " " + end[0]);
              System.out.println(start[1] + " " + end[1]);
                if (start[1] == end[1]) {
                    //종료 시간이 같을 경우엔 시작시간으로 정렬
                    return Integer.compare(start[0], end[0]);
                }
                //종료시간에 따라 정렬
                return Integer.compare(start[1], end[1]);
            }
        });

        int count = 0;
        int end = -1; //다음시작 시간과 비교할 변수
        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= end) {
                end = arr[i][1];
                count++;
            }
        }

       System.out.println(count);

    }
}
