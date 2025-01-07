public class sum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n=5;
        int even=0;
        int odd =0;
        int i=1;
        do { 
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;

            }
            i++;
        } while (i<=n);
        System.out.println("odd:"+odd);
        System.out.println("even:"+even);
        
    }
    
}
