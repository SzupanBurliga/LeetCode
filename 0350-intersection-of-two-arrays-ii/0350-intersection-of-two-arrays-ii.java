class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int len = 0;
        for(int x: nums1)
            map.put(x, map.getOrDefault(x, 0) + 1);
        for(int x: nums2){
            if(map.containsKey(x) && map.get(x) > 0){
                map.put(x, map.get(x) -1);
                System.out.println(map);
                list.add(x);
                len++;
            }
        }
        
        int[] out = new int[len];
        for(int i=0; i<list.size(); i++){
            out[i] = list.get(i);
        }
        
        
        return out;
    }
}