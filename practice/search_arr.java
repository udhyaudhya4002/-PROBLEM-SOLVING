import java.util.*;
public class search_arr {
    public static void main(String[] args) {
        System.out.println("Enter Size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter search:");
        int ser=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter num:");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        boolean g = true;
        for(int i=0;i<=arr.length-1;i++){
         if(arr[i]==ser){
            g = false;
           // System.out.println("num found");
            break;
         }
         /*else{
            System.out.println("not found");
         }*/
        }
        if (g == false){
            System.out.println("num found");
        }
        else{
            System.out.println("not found");
        }
    } 
    
}
