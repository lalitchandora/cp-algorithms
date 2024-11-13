package cp_practice.atcoder;

import java.util.Scanner;

public class abc43c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[n];
        int i = 0;
        double sum = 0;
        while (i < n) {
            arr[i] = scan.nextInt();
            sum += arr[i];
            i++;
        }
        int opt = (int) Math.ceil(sum / n);
        int opt2 = (int) Math.floor(sum / n);
        int cost = 0;
        int cost2 = 0;
        for (int a : arr) {
            cost += (a - opt) * (a - opt);
            cost2 += (a - opt2) * (a - opt2);
        }
        System.out.println((cost < cost2) ? cost : cost2);
        scan.close();
    }
}