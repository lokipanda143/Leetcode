class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastOcc = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                if(lastOcc != -1){
                    int gap = i - lastOcc - 1;
                    if(gap < k){
                        return false;
                    }
                }
                lastOcc = i;
            }
        }
        return true;
    }
}