class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ifAnagram = false;
        HashMap <Character, Integer> hashMap = new HashMap <>();
        for(char newS: s.toCharArray()){
            hashMap.put(newS, hashMap.getOrDefault(newS,0) + 1);
        }
        
        for(char newT: t.toCharArray()){
            hashMap.put(newT, hashMap.getOrDefault(newT,0) -1);
        }

        for(int x: hashMap.values()){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}