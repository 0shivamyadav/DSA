class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int nums[],int k){
        int l=0,odc=0,c=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==1) odc++;
            while(odc>k)
            {
                if(nums[l]%2==1) odc--;
                l++;
            }
            c+=i-l+1;
        }
        return c;
    }
}