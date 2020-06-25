package greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), "");
        int n = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++)
           arr.add(Integer.parseInt(st.nextToken()));

        arr.sort(null); //오름차순 정렬
        //1 2 3 3 4
        int total = 0;
        int accum = 0;
        for(int i=0; i<n; i++) {
            accum += arr.get(i);
            total += accum;
        }
        bw.write(String.valueOf(total));

        bw.flush();
        bw.close();

    }
}
