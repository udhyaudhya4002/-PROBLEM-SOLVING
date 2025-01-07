public class harshad_num {
    public static void main(String[] args) {
        int num= 13;
        //swap 
        int o = num;
        int sum =0;
        //suming digits
        while(num>0){
            sum+=num%10;
            num/=10;
        }System.out.println(sum); 
        //check it is harshad or not 
        
    if( o%sum==0 ){
        System.out.println("Numner is harshad");
    }
    else{
        System.out.println("num is not harshad");
    }
    
}
}
