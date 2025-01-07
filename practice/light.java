import java.util.Scanner;
class light{
    public static void main(String arg[]){
        Scanner scan= new Scanner(System.in);
        String color=scan.nextLine();
        if (color.equals("red")){
            System.out.println("Stop");
        } 
        else if(color.equals("yellow")){
            System.out.println("Get ready");

        }
        else if(color.equals("green")){
            System.out.println("go!!!");
        }
    }
}