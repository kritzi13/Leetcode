class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount=0;
        int maxcount=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==1){
                currentcount+=1;
                maxcount = Math.max(maxcount, currentcount);

            }
            else{
                currentcount=0;
            }
        }
      return maxcount;
    }
}
