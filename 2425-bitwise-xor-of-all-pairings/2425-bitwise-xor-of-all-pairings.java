class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;
        for(int num: nums1){
            xor1 ^= num;
        }
        for(int num: nums2){
            xor2 ^= num;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 % 2 == 0 && len2 % 2 ==0) return 0;
        if(len1 % 2 == 0) return xor1;
        if(len2 % 2 == 0) return xor2;

        return xor1 ^ xor2;
    }
}