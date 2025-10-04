class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String x: strs){
            char[] word = x.toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(x);
        }
        return new ArrayList<>(map.values());
    }
}