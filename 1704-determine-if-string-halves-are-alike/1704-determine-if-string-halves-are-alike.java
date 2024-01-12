class Solution {
     public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');

        String firstHalf = s.substring(0, s.length()/2);
        String secondHalf = s.substring(s.length()/2);
        int counter1 = 0;
        int counter2 = 0;
        for(int i=0; i < s.length()/2; i++) {
            
            if(vowels.contains(firstHalf.charAt(i))){
                counter1 += 1;
            }
            if(vowels.contains(secondHalf.charAt(i))){
                counter2 += 1;
            }
        }
        return counter1 == counter2;
        
    }
}