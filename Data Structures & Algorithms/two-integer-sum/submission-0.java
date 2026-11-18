class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rem = target - nums[i];
            if(h.containsKey(rem)){
                return new int[]{h.get(rem), i};
            }


            else{
                h.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
