class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length <= 0){
            return 0;
        }

        HashMap<Integer, Integer> tracker = new HashMap<>();
        for(int num : nums){
            if(tracker.remove(num) == null){
                tracker.put(num, 1);
            }
        }

        return tracker.keySet().iterator().next();
    }
}
