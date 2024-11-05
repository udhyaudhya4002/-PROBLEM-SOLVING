import java.util.Scanner;

class SumCube {
    public static void main(String[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of M and N:");

        int M = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;  

        if (M > N) {
            System.out.println("0");
        } else {
            for (int i = M; i <= N; i++) {
                sum += i * i * i;  
            }
            System.out.println(sum);
        }
    }
}
