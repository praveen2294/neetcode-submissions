class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> elementAndIndex = new HashMap<>();
        int [] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(elementAndIndex.containsKey(target-nums[i])){
               arr[0] = elementAndIndex.get(target-nums[i]);
               arr[1] = i;
            }
            elementAndIndex.put(nums[i],i);
        } 
        return arr;
    }
}
