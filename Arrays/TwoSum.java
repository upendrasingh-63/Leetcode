class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]+nums[j]==target){
                return new int[]{j, i};
                }
            }
        }
        return new int[]{};
    }
}

// Approach:
// Iterate Through Each Pair: Use two nested loops to iterate over all pairs of elements in the array.
// Check Sum: For each pair, check if their sum equals the target value.
// Return Indices: If a pair is found that meets the condition, return their indices.
// Return Empty Array: If no such pair is found after all iterations, return an empty array.
