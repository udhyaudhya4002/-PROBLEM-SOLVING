public class pattern122 {
    public static void main(String[] args) {
        int n=7;
        int even=0;
        int odd=0;
        for(int i=1;i<n;i++){
            odd=i;
            for(int j=1;j<i+1;j++){
                if(j%2==0){
                    System.out.printf("%2d ",even);
                    odd=even+(i-j)*2;
                }
                else{
                    System.out.printf("%02d ",odd);
                    even=odd+((n-(i-1))*2)-1;
                }
                

        }System.out.println();
    }
    
    }}
