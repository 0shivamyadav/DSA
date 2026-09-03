class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        int mx = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (index < i) {
                mx = nums[i];
                index = i;
                for (int j = i + 1; j < i + k; j++) {
                    if (nums[j] > mx) {
                        mx = nums[j];
                        index = j;
                    }
                }
            } 
            else {
                if (nums[i + k - 1] >= mx) {
                    mx = nums[i + k - 1];
                    index = i + k - 1;
                }
            }
            ans[i] = mx;
        }
        return ans;
    }
}


// my code solution
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         if(nums.length==1) return nums;
//         int ans[]=new int[nums.length-k+1];
//         for(int i=0;i<nums.length-k+1;i++)
//         {
//             int mx=nums[i];
//             for(int j=i+1;j<i+k;j++)
//             {
//                 if(nums[j]>mx) mx=nums[j];
//             }
//             ans[i]=mx;
//         }
//         return ans; 
//     }
// }
