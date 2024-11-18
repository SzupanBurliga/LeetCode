class Solution {
    public String reverseVowels(String s) {
        List<Integer> index = new ArrayList<>();
        String vowel = "aeiouAEIOU";
        String out = "";
        int num = 0;
        for(int i=0; i< s.length(); i++){
            if(vowel.indexOf(s.charAt(i)) != -1){
                index.add(i);
            }
        }
        Collections.reverse(index);
        for(int i=0; i<s.length(); i++){
            if(vowel.indexOf(s.charAt(i)) == -1){
                out = out + s.charAt(i);
            }
            else{
                out = out + s.charAt(index.get(num));
                num++;
            }
        }
        return out;
    }
}