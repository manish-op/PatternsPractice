package PatternsPractice;

public class SetofTriangles {
    public static void main(String[] args) {
        //for n=5;
        int n=5;
        //1st triangle
        for(int i=0;i<n/2+2;i++){ //for no. of rows
            //for spaces
            for(int j=0;j<n+(2-i);j++){
                System.out.print(" ");
            }
            //for stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //middle part
        for (int i=0;i<n;i++){
            //for spaces
            for (int j = 0; j < n/2+1; j++) {
                if(j>=n/2-i && j>=i-n/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            //for middle spaces
            for (int j = 0; j < n*2-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n/2+1; j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

        //lower part
        for (int i = 0; i <n/2+2 ; i++) {
            for (int j = 0; j < n-1+i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n+2-(2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
