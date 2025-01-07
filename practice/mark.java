import java.util.Scanner;
class mark{
    public static void main(String arg[]){
        Scanner scan= new Scanner(System.in);
        int mark=scan.nextInt();
        if(mark<50){
            System.out.println("need to improve");
    
        }
        else if(mark>50 && mark<=80){
            System.out.println("good job");
        }
        else if(mark>80 && mark<=100){
            System.out.println("Excellent !!!");

        }
    }
}