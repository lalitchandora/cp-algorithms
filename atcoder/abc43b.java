package cp_practice.atcoder;

import java.util.Scanner;
import java.util.Stack;

public class abc43b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '0')
                st.push(0);
            if (c == '1')
                st.push(1);
            if (!st.isEmpty() && c == 'B')
                st.pop();
        }
        for (Integer st2 : st) {
            System.out.print(st2);
        }
    }
}
