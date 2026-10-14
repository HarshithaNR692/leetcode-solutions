class Solution {
     static int sum=0;
    public static void backtrack(int idx,int[] arr,int target,List<List<Integer>> re,List<Integer> te)
    {
        if(sum>target){
            return;
        }
        if(sum==target){
            re.add(new ArrayList<>(te));
            return;
        }
        if(idx==arr.length){
            return;
        }
        te.add(arr[idx]);
        sum+=arr[idx];
        backtrack(idx,arr,target,re,te);
        te.removeLast();
        sum-=arr[idx];
        backtrack(idx+1,arr,target,re,te);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> re=new ArrayList<>();
     List<Integer> te=new ArrayList<>(); 
     backtrack(0,candidates,target,re,te);
     return re; 
    }
}

