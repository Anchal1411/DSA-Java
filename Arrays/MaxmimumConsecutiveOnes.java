public class MaxmimumConsecutiveOnes {
    
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int cnt=0;
        int maxLen=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                cnt++;
            }else{
                maxLen=Math.max(cnt,maxLen);
                cnt=0;
            }
        }
        maxLen=Math.max(cnt,maxLen);
        return maxLen;
    }
}
 