package PatternsPractice;

public class DPTriangle {
    public static void main(String[] args) {
        int n = 5;

        // First part
        for (int i = 0; i < n / 2 + 2; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + 2 * i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // Second part
        for (int i = 1; i < n / 2 + 1; i++) {
            if (i < n / 2 + 1) {
                for (int j = 0; j < n / 2 - i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Third part
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n + 2 * (n / 2 + 1); j++) {
                if (j < n / 2 + 1 || j > n + n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }


        // Fourth part
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }


    }

