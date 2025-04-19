package PatternsPractice;

public class OddEvenMatrix {
    public static void main(String[] args){
        //print 0 if sum of row and column is even else print 1

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){

                int sum= i+j;
                if(sum%2==0){
                    System.out.print(" 0" );
                }else{
                   System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }
}
