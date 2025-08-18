class Solution {
    public int divisorSubstrings(int num, int k) {
        String  s=Integer.toString(num);
        int i=0;
        int j=k-1;
        int cnt=0;
        while(j<s.length()){
            String sub=s.substring(i,j+1);
            int n=Integer.parseInt(sub);
            if(sub.length()==k && n!=0 && num%n==0){
               cnt++;
            }
            i++;
            j++;
        }
        return cnt;
    }
}