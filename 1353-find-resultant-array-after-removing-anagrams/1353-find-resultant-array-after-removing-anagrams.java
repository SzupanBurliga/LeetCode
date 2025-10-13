import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        Map<Character, Integer> prevMap = null;

        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            if (prevMap == null || !map.equals(prevMap)) {
                list.add(words[i]);
                prevMap = map;
            }
        }
        return list;
    }
}
