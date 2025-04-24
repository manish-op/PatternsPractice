package PatternsPractice;

public class DPTriangle4 {
    public static void main(String[] args) {
        int n = 4;
        int x = 0;

        for (int i = 0; i < 2 * n; i++) {
            boolean flag = false;

            if (i < n+1) {
                System.out.print("@");
            } else {
                System.out.print(" ");
            }

            for (int j = 0; j < n * (n - 1) + 1; j++) {
                if (i >= n / 2 && i < 2 * n - n / 2) {
                    if (j < (n - 1) * x || j > (n - 1) * x + n - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                        flag = true;
                    }
                } else {
                    System.out.print(" ");
                }
            }

            if (flag) {
                x++;
            }

            if (i >=n - 1) {
                System.out.print("@");
            } else {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
