import java.io.*;

public class Problem5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //무조건 햄버거 1개, 콜라1개를 선택해야 된다
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()); //가격 입력
        }

        int burger = arr[0]; //버거
        int beverage = arr[3]; //음료

        for (int i = 1; i < 3; i++) {
            if (burger > arr[i]) {
                burger = arr[i];
            }
        }

        if (beverage > arr[4]) {
            beverage = arr[4];
        }

        int sum = burger + beverage - 50;
        bw.write(sum +"");
        bw.flush();




    }
}
