class Solution {
    public int numJewelsInStones(String jew, String sto) {
       HashSet<Character> hs=new  HashSet<>();
       for(Character c: jew.toCharArray()){
         hs.add(c);
       }
       int cnt=0;
       for(char c: sto.toCharArray()){
         if(hs.contains(c)){
            cnt++;
         }
       }
       return cnt;
    }
}