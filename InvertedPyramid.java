package PatternsPractice;

public class InvertedPyramid {
    public static void main(String[] args){
        int n=6;
        for (int i=n; i>0; i--){
            for (int j = 0; j<i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("*********************");
        System.out.println();

        for (int i = 5 ; i > 0 ; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

        //Third Method
        System.out.println("*********************");
        System.out.println();

        for (int i=0;i<5;i++){
            for (int j=i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("_____________________________________");

        //inverted pyramid with numbers

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
