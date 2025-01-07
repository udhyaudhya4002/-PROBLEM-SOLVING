import java.util.Random;
class random{
    public static void main(String[] args) {
        int num1=0;
        while(num1!=12231){
            Random rand= new Random();
            num1=rand.nextInt(100000);
            System.out.println(num1);
        }
        
    }
}