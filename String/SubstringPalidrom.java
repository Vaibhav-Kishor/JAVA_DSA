package String;

import java.util.Scanner;

public class SubstringPalidrom {
    public static boolean isPalidrom(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char charStart = s.charAt(start);
            char charEnd = s.charAt(end);
            if (charStart != charEnd) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String sub_string = s.substring(i, j);
                if (isPalidrom(sub_string)) {
                    System.out.println(sub_string);
                }
             }
            System.out.println("");
        }
    }

}
