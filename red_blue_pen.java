public class red_blue_pen {
    public static void main(String[] args) {
        int n=0;
        int rep=0;
        int[] arr={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] % 2!=0){
                if(arr[i+1] %2 ==0){
                     rep= rep+1;
                }
               

            }
        }
        System.out.println(rep);
    }
    
}
