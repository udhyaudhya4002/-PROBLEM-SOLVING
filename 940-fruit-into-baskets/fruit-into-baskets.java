class Solution {
    public int totalFruit(int[] f) {
        int s=0,e=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=f.length,max=0;
        while(e<n){
            map.put(f[e],map.getOrDefault(f[e],0)+1);
            while(map.size()>=3){
                map.put(f[s],map.get(f[s])-1);
                if(map.get(f[s])==0){ map.remove(f[s]);
                }s++;
            }
            int cmax=e-s+1;
            max=Math.max(cmax,max);
            e++;
        }
        return max;
    }
}