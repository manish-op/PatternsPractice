package PatternsPractice;

public class SolidRhombus {
    public static void main(String[] args){

        for (int i = 0; i <=5; i++) {

            //for spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j=0;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("_-____-------_-------____-___--____-_");

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
