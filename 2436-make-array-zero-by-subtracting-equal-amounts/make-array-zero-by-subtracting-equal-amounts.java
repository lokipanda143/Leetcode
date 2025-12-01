class Solution {
    public int minimumOperations(int[] nums) {
    Set<Integer> s = new HashSet<>();
    for(int r:nums){
        if(r>0){
            s.add(r);
        }
    }
    return s.size();
    }
}