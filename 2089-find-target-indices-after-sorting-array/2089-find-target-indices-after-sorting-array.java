class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer>al=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
           if(nums[i]==target)
           {
            al.add(i);
           }
        }
        return al;
    }
}