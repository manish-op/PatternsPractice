package PatternsPractice;

public class ButterflyPattern {
    public static void main(String[] args) {

        int n=5;
        //upper half
        for (int i=1;i<=n;i++){
            //for stars
            for (int j = 1; j<=i ; j++) {
                System.out.print(" * ");
            }
            //for spaces
            int spaces=2*(n-i);
            for (int j=0; j<spaces;j++){
                System.out.print(" - ");
            }
            //for stars
            for (int j = 0 ;j <i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //lower half


        for (int i=n;i>=1;i--){
            //for stars
            for (int j = 0; j <i ; j++) {
                System.out.print(" * ");
            }
            //for spaces
            int spaces=2*(n-i);
            for (int j=0; j<spaces;j++){
                System.out.print(" - ");
            }
            //for stars
            for (int j = 0; j <i ; j++) {
                System.out.print( " * ");
            }
            System.out.println();
        }

        System.out.println(".............................");

        //printing hollow butterfly

        int rows=5;
        //upper half
        for (int i=1;i<=rows;i++){
            //for stars
            for (int j = 1; j <=i ; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            //for spaces
            int spaces=2*(rows-i);
            for (int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <=i ; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

        //lower half


        for (int i=rows;i>=1;i--){
            //for stars
            for (int j = 1; j <=i ; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            //for spaces
            int spaces=2*(rows-i);
            for (int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <=i ; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }
}
