package cp_practice.atcoder;

import java.util.Scanner;

public class abc42c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.nextLine();
        int i = 0;
        int[] dig = new int[k];
        while (i < k) {
            dig[i] = scan.nextInt();
            i++;
        }

        while (!checkStatus(n, dig)) {
            n++;
        }
        System.out.println(n);
    }

    public static boolean checkStatus(int n, int[] dig) {
        String num = n + "";
        for (int d : dig) {
            if (num.contains(d + ""))
                return false;
        }
        return true;
    }
}
