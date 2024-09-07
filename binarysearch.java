package cp_algorithms;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int find = 4;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == find) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > find)
                right = mid - 1;

            else
                left = mid + 1;
        }
        System.out.println(-1);
    }
}
