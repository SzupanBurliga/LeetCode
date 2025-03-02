class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i < nums1.length; i++){
            int index = nums1[i][0];
            int val = nums1[i][1];
            map.put(index, map.getOrDefault(index, 0) + val);
        }
        for(int i=0; i < nums2.length; i++){
            int index = nums2[i][0];
            int val = nums2[i][1];
            map.put(index, map.getOrDefault(index, 0) + val);
        }
        int[][] out = new int[map.size()][2];
        int i=0;
        for(int key: map.keySet()){
            out[i][0] = key;
            out[i][1] = map.get(key);
            i++;
        }
        return out;
    }
}