class Solution {
    public int countValidSelections(int[] nums) {
        int out = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int[] a1 = Arrays.copyOf(nums, nums.length);
                boolean right = true;
                int j = i;

                while (j >= 0 && j < a1.length) {
                    if (a1[j] == 0) {
                        j += right ? 1 : -1;
                    } else {
                        a1[j]--;
                        right = !right;
                        j += right ? 1 : -1;
                    }
                }
                
                boolean allZero = true;
                for (int x : a1) if (x != 0) { allZero = false; break; }
                if (allZero) out++;

                int[] a2 = Arrays.copyOf(nums, nums.length);
                right = false;
                j = i;
                while (j >= 0 && j < a2.length) {
                    if (a2[j] == 0) {
                        j += right ? 1 : -1;
                    } else {
                        a2[j]--;
                        right = !right;
                        j += right ? 1 : -1;
                    }
                }
                allZero = true;
                for (int x : a2) if (x != 0) { allZero = false; break; }
                if (allZero) out++;
            }
        }
        return out;
    }
}
