public class arr_cout{
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        int odd=0;
        int even=0;
        for (int i=0;i<=arr.length-1;i++){
          if(arr[i]%2==0){
            even++;

          }else{
            odd++;

          }
        }
        System.out.println(odd);
        System.out.println(even);


        
    }
    
}
