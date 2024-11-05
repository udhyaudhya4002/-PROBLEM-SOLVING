import java.util.Scanner;

class Train_booking {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of tickets");
        int quant = scanner.nextInt();
        int[] age = new int[quant];
        System.out.println("Enter the age ");
        int des = scanner.nextInt();
        if(des>0){
            if(des>60){
                sum = quant*30;
        }
        else if(des<12){
            sum = quant*20;
        }
        else{
            sum =quant*60;
        }
        }
        else{
            for (int i = 0; i < quant; i++) {
                System.out.println("Enter All Ages");
                age[i] = scanner.nextInt();
                if(age[i]>60){
                        sum +=30;
                }
                else if(age[i]<12){
                    sum += 20;
                }
                else{
                    sum +=60;
                }
            }
        }
        
        System.out.println(sum);
    }
}