class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int re=target-nums[i];
            if(res.containsKey(re)){
                return new int []{res.get(re),i};
            }
            res.put(nums[i],i);
        }
        return  new int []{};
    }
}