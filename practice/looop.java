  import java.util.Scanner;
  class looop{
    public static void main(String arg[]){
      Scanner val= new Scanner(System.in);
      int input= val.nextInt();

      
      for(int i=0;i<=input;i++){
         int[] array= new int[i];
                   System.out.println(input + " x " + i + " = " + (input *i));
      

      }
       

    }
  }
