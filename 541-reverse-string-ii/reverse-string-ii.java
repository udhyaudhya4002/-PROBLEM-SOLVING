class Solution {
    public String reverseStr(String s, int k) {    
        char[] arr=s.toCharArray();
        int n=s.length();
        int st=0;
        while(st<n){
            int end=Math.min(st+k-1,n-1);
            rev(arr,st,end);
            st+=2*k;
        }  
        return new String(arr);

    }
    static void rev(char arr[],int st,int end){
        while(st<end){
            char temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }

}