package PatternsPractice;

public class TriangleWithSpaces {
    public static void main(String[] args){
       int n=5;
        for(int i=0;i<n;i++){

            // for printing spaces
            for (int j = i; j<n-1 ; j++) {
                System.out.print(" ");
            }

            //for printing stars

            for (int k = 0; k <=i ; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println();


        }

        //using decrement operators

        for (int i = 5; i >0 ; i--) {

            //for spaces
            for (int j = i; j >1 ; j--) {
                System.out.print(" ");
            }
        //for stars
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }

            for (int j = n-1; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
