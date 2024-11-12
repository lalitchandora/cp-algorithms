package cp_practice.atcoder;

import java.util.Arrays;
import java.util.Scanner;

class abc42a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();

        Arrays.sort(arr);

        if (arr[0] == 5 && arr[1] == 5 && arr[2] == 7)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
