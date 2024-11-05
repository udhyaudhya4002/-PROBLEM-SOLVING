import java.util.Arrays;
import java.util.Scanner;
class largest_no_combination {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the valu");
        for (int i=0;i<size;i++){
            arr[i]=scan.nextInt();
            System.out.print(arr);

        }
        Arrays.sort(arr);
        System.out.println(arr);
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(j);
        }
    }
}
