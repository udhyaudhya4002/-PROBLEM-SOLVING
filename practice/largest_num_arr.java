import java.util.*;
class largest_num_arr{
    public static void main(String[] args) {
        int arr[]={1,2,3,45,6,1,2,35,2,4,5,3,5,6454,534,34};
        Arrays.sort(arr);
        System.out.println("largest num:"+arr[arr.length-1]);
        System.out.print("Secondlargest num:"+arr[arr.length-2]);
    }
}