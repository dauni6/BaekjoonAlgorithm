package basicarithmatic;

import java.util.Scanner;

public class Problem2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * (b%10)); //a * 5
        System.out.println(a * ((b%100)/10)); // a * 8
        System.out.println(a * (b/100)); // a * 3
        System.out.println(a * b);


    }
}
