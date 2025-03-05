class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        String hold = "";

        for(int i=0; i<words.length; i++){
            char[] charArray = words[i].toCharArray();
            Arrays.sort(charArray);
            String ans = String.valueOf(charArray);
            if(!ans.equals(hold)){
                list.add(words[i]);
                hold = ans;
            }
        }
        return list;
    }
}