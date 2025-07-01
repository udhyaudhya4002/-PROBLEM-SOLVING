class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<>();
    //    HashMap<Character,Integer> map1=new HashMap<>();
    //    HashMap<Integer> map1=new HashMap<Integer>;
    for (char ch : s.toCharArray()) { // For characters in a string
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    for (char ch : t.toCharArray()) { // For characters in a string
        map.put(ch, map.getOrDefault(ch, 0) - 1);
    }
    for(int  val : map.values()){
        if(val!=0){
            return false;
        }
    }
        return true;
    }
}