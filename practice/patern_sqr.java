

public class patern_sqr {
    public static void main(String[] args) {
        int n=4 ;
        int copy=1;
        for(int i=1;i<=2*n-1;i++){
            for (int j=1;j<=n*2-1;j++){
            if (copy>j)
                System.out.print("- ");
            else
            System.out.print("* ");     
            }
            if(i<n)copy++;
            else copy--;
           System.out.println();
        }
    }
    
}     
