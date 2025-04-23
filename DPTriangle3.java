package PatternsPractice;

public class DPTriangle3 {
    public static void main(String[] args) {

        int n = 3;
        //first part
        for (int i = 0; i <=n; i++) {

            //for stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print("-");
            }


            //for middle @ symbol
            for (int j = 0; j < n; j++) {
                if (i == n) {
                    System.out.print("@");
                }else System.out.print(" ");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        
        //middle @ part

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < 3*n; j++) {
                if (j<n ||j>2*n-1){
                    System.out.print("-");
                }else System.out.print("@");
            }
            System.out.println();
        }

        //lower part
        for (int i = 0; i <= n/2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < n-2*i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        

    }
}
