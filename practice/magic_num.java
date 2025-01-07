import java.util.Scanner;
public class magic_num {
    public static void main(String[] args) {
        int mag=20;
        int i=0;
        Scanner scan=new Scanner(System.in);
        while (i!=mag) {
            System.out.println("enter num");
            int num=scan.nextInt();
            if (mag<num){
                System.out.println("num is high");
            } 
            else if (mag>num) {
                System.out.println("too low");
                
            }
            else{
                System.out.println("num is equal");
                break;
            }
            
            
        }
    }

    
}
