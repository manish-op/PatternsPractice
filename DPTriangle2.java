package PatternsPractice;

public class DPTriangle2 {
    public static void main(String[] args) {

        //1st part
        int n=5;
        for (int i = 0; i <= n/2; i++) {
            //for leading spaces
            for (int j = 0; j < n/2; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("1");
            }
            //for symbols
            for (int j = 0; j < n-(2*i); j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        //2nd part for hollow rectangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || j==n-1){
                    System.out.print("*");
                }else System.out.print("-");
            }
            System.out.println();
        }

    }
}
