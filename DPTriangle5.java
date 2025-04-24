package PatternsPractice;

public class DPTriangle5 {
    public static void main(String[] args) {
        //1st part -- upper triangle

        int n=3;
        for (int i = 0; i < n; i++) {
            //for initial spaces
            for (int j = 0; j < n/2; j++) {
                System.out.print("-");
            }
            //for hollow box
            for (int j = 0; j < n+2; j++) {
                if (i==0 || j==0 ||j==n+1||i==n-1){
                    System.out.print("@");
                }else System.out.print("-");
            }
            System.out.println();
        }

        // middle e symbol pattern vertical lines
        for (int i = 0; i < n; i++) {
            //initial spaces
            for (int j = 0; j < n/2; j++) {
                System.out.print("-");
            }
        //printing e pattern
            for (int j = 0; j < n+2; j++) {
                if (j==0||j==n+1){
                    System.out.print("e");
                }else System.out.print("-");
            }
            System.out.println();
        }

        //last part inverted pyramid
        for (int i = 0; i < n/2+1; i++) {
            for (int j = 0; j < 2*n+1; j++) {
                if (j>=i && j<=n-1-i || j>=n+1+i && j<=n*2-i){
                    System.out.print("*");
                }else System.out.print("-");
            }
            System.out.println();
        }

    }
}
