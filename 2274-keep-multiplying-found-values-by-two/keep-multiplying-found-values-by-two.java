class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> ffv = new HashSet<>();
        for(int n : nums){
            ffv.add(n);
        }

        while(ffv.contains(original)){
            original = original * 2;
        }

        return original;
    }
}