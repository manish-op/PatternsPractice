package PatternsPractice;

public class DPTriangle1 {
    public static void main(String[] args) {
        int n=3;
        int i,j;
        //1st part
        if (n < 1 || n % 2 == 0) {
           return;
        }

        int mid = n / 2;

        // Upper part with '@' symbols
        for (i = 0; i <= mid; i++) {
            for (j = 0; j < mid; j++) {   //runs 0 to n/2-1 times'
                System.out.print("-");
            }
            for (j = 0; j < i; j++) {
                System.out.print("-");
            }
            for (j = 0; j < n - (2 * i); j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // Rectangle with '*' symbols and spaces inside
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
