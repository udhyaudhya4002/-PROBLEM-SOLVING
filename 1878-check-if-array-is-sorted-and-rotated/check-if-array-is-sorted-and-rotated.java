class Solution {
    public boolean check(int[] arr) {
        String str="";

        for(int i=0;i<arr.length;i++){
             str+=String.valueOf(arr[i]);
             str+='_';
              
        }
        str+=str;
        Arrays.sort(arr);
        String str1="";
         for(int i=0;i<arr.length;i++){
             str1+=String.valueOf(arr[i]);
             str1+='_';
              
        }
        return str.contains(str1);
    }
}