package PatternsPractice;

public class PatternTriX {
    public static void main(String[] args) {

        int n = 5;

        // First part
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Middle parts
        for (int i = 0; i < n - 1; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int i = 0; i < 2 * n + 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        // Last part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
