class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int cnt=1;
        for(int i=0;i<s.length()-1;i++){
              if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
              }
              else{
             al.add(cnt);
             cnt=1;
              }
            }
        al.add(cnt);
        int sum=0;
        for(int i=0;i<al.size()-1;i++){
            sum+=Math.min(al.get(i),al.get(i+1));
        }
        return sum;
    }
}