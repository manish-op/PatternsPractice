package PatternsPractice;

public class PatternZ {
    public static void main(String[] args){
        //for 1st part
        int n=5;
        for (int i = 0; i < n/2+1; i++) {
            //for spaces
            for (int j = 0; j < n*2+1-i; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd part
        for (int i = 0; i < n-1; i++) {
            //for spaces
            for (int j = 0; j < n*2+1; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3rd part
        for (int i = 0; i < n/2; i++) {
            //for spaces
            for (int j = 0; j < n+2; j++) {
                System.out.print(" ");
            }
            //for spaces
            for (int j = 0; j < n; j++) {
                if (i==0||j==0){
                    System.out.print("e");
                }else System.out.print(" ");
            }
            System.out.println();
        }

        //4th part

        for (int i = 0; i < n; i++) {
            //for spaces
            for (int j = 0; j < n/2+1; j++) {
                if (j>=n/2-i && j>=i-n/2){
                    System.out.print("*");
                }else System.out.print(" ");

            }

            for (int j = 0; j < n/2+2; j++) {
                if (i==n/2){
                    System.out.print("*");
                }else System.out.print(" ");
            }

            for (int j = 0; j < 1; j++) {
                if (i<3){
                    System.out.print("e");
                }
            }
            System.out.println();
        }


    }
}
