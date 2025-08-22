class Solution {
    public int[] decrypt(int[] code, int k) {
       if(k==0) return new int[code.length];
       int arr[]=new int[code.length*2]; 
       System.arraycopy(code, 0, arr, 0, code.length);              // first copy
       System.arraycopy(code, 0, arr, code.length, code.length);
       int n=code.length;    // second copy
       for(int i=0;i<code.length;i++){
        int sum=0;
            if (k > 0) {
                // sum of next k elements
                for (int j = i + 1; j <= i + k; j++) {
                    sum += arr[j];
                }
            } else {
                // sum of previous |k| elements
                for (int j = i + n + k; j < i + n; j++) {
                    sum += arr[j];
                }
            }
            code[i]=sum;
            
        }
       
        return code;
    }
}