class Solution {
    public static void backtrack(int idx,int[] arr,List<List<Integer>> ans,List<Integer> temp){
        if(idx==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[idx]);
        backtrack(idx+1,arr,ans,temp);
        temp.remove(temp.size() - 1);
        backtrack(idx+1,arr,ans,temp);
    }

    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> temp=new ArrayList<>();
       backtrack(0,nums,ans,temp); 
       return ans;
    }
}