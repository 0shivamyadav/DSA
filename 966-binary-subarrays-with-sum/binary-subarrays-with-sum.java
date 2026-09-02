class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
         int sum=0,c=0;
        int n=nums.length;
        map.put(0,1);
        for (int i=0;i<n;i++)
        {
            sum+=nums[i];
            c+=map.getOrDefault(sum-goal,0);
            map.put(sum, map.getOrDefault(sum,0)+1);  
        }
        return c;
    }
}