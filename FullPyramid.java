package PatternsPractice;

public class FullPyramid {
    public static void main(String[] args){


        int n=5;
        for (int i = 0; i <n ; i++) {

            //for spaces
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int k = 0; k < 2*i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("##############################");

        // inverted pyramid

        int m=5;
        for (int i = m; i >=1 ; i--) {
            //for spaces
            for (int j = 5; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
