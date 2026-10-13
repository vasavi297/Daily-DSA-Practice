class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        
        Arrays.sort(squares);
        
        long ans = 0;
        // Subtract the smaller half and add the larger half
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            if (i < mid) {
                ans -= squares[i]; // Smaller elements subtracted
            } else {
                ans += squares[i]; // Larger elements added
            }
        }
        
        return ans;
    }
}