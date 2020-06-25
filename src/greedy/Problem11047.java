package greedy;

import java.util.Scanner;

public class Problem11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];

        for (int i = 0; i < n; i++)
            coins[i] = sc.nextInt();

        int quotient = 0;

        for (int i = n - 1; i >= 0; i--) {
            quotient += k/coins[i];
            k = k%coins[i];
            if (k%coins[i] == 0) break;
        }

        System.out.println(quotient);

    }
}
