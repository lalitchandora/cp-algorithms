package cp_practice.atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class abc42b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        scan.nextLine();

        String[] arr = new String[n];
        while (n > 0) {
            arr[arr.length - n] = scan.nextLine();
            n--;
        }
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.print(s);
        }
        scan.close();
    }
}
