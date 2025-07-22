class Solution {
    public int numUniqueEmails(String[] e) {
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < e.length; i++) {
            String[] parts = e[i].split("@"); 
            String local = "";
            
            for (int j = 0; j < parts[0].length(); j++) {
                char c = parts[0].charAt(j);
                if (c == '+') break; 
                if (c != '.') local += c; 
            }
            
            String cleanEmail = local + "@" + parts[1];
            set.add(cleanEmail);
        }
        
        return set.size();
    }
}
