class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map.containsKey(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                map.put(grid[i][j],i);
            }
        }
        for(int i=0; i< n*n; i++){
            if(!map.containsKey(i+1)){
                ans[1] = i+1;
            }
        }
        
        return ans;
    }
}