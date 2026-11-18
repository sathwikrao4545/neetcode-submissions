class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<n;i++){
            if(h.containsKey(nums[i])){
                return true;
            }

            else{
                h.put(nums[i], i);
            }
        }

        return false;
        
    }
}