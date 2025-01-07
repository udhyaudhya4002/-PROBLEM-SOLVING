public class majority_arr {
    public static void main(String[] args) {
     int arr[]={1,2,3,2,2,3,3,2};
     int count=0;
     int chk=0;
     for(int i=0;i<arr.length;i++){
      for(int j=1;j<arr.length;j++){
         if(arr[i]==arr[j]){
            count++;
         }
      }System.out.println(count);
     }

     
    }
   }
    

