package PatternsPractice;

public class NumberHillPattern {
    public static void main(String[] args) {
        int rows=5;

        for (int i = 1; i <=rows ; i++) {

            //for spaces
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

     // another same pattern
        System.out.println("#############################");

        int n=5;

        for (int i = 1; i <=n; i++) {

            //for spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            //for left pattern
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }

            //for right pattern
            for (int k =i-1 ; k >=1; k--) {
                System.out.print(k);
            }
            System.out.println();

        }



    }
}
