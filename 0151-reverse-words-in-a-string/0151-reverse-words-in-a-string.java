class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        
        for(int i=arr.length - 1; i >=0; i--){
            if(!arr[i].isEmpty())
            sb.append(arr[i] + " ");
        }

        return sb.toString().trim();
    }
}