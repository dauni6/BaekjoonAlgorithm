package whilemun;

import java.util.Scanner;

public class Problem10996_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i= 1  ; i <= 2*num; i++) {
            for(int j=1 ; j<=num; j++) {
                if((i + j) % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
