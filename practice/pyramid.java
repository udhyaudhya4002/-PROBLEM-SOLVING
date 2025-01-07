public class pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print("   ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(" * ");

            }
            System.out.println("*");

            
        }
    }
    
}
