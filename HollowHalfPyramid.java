package PatternsPractice;

public class HollowHalfPyramid {
    public static void main(String[] args){

        int rows = 5;  //  number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print '*' if it's the first or last column, or the last row
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Space for hollow effect
                }
            }
            System.out.println();  // Move to next line
        }
    }
}
