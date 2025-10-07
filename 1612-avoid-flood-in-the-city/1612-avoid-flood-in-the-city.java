class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] out = new int[rains.length];
        Arrays.fill(out,1);
        System.out.println(out[0]);
        TreeSet <Integer> set = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<rains.length; i++){
            if(rains[i] == 0){
                set.add(i);
            }else{
                out[i] = -1;
                if(map.containsKey(rains[i])){
                    Integer index = set.ceiling(map.get(rains[i]));
                    if(index == null){
                        return new int[0];
                        // there will be flood
                    }
                    out[index] = rains[i];
                    set.remove(index);
                }
                map.put(rains[i],i);
            }
        }
        return out;
    }
    
}