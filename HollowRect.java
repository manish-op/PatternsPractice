package PatternsPractice;

public class HollowRect {
    public static void main(String[] args) {
        int n=7;  // rows
          //columns
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }
    }
}
