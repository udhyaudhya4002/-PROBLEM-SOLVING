class Solution {
    public List<String> stringMatching(String[] w) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<w.length;i++){
            for(int j=0;j<w.length;j++){
                if(i!=j){
                    if(w[j].contains(w[i])){
                        list.add(w[i]);
                        break;
                    }
                }
            }
        }
        return list;

    }
}