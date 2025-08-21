class Solution {
    public int thirdMax(int[] nums) {
       long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == max || nums[i] == max2 || nums[i] == max3) continue;

            if (nums[i]>max){
                max3 = max2;
                max2= max;
                max = nums[i];
            }
            else if(max2<nums[i] && max2!=max){
                max3 = max2;
                max2 = nums[i];
            }
            else if(max3<nums[i] && max3!=max2 && max3 !=max){
                max3= nums[i];
            }            
        }
    return max3 == Long.MIN_VALUE ? (int)max : (int)max3; //agar elements hi 2 hue toh maximum print kardena
    }
}
