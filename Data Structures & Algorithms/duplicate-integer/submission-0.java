class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate;
    }
}