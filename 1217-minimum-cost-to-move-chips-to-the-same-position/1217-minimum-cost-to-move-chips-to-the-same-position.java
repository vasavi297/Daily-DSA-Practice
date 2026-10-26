class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        int count=Integer.MAX_VALUE;
        for(int i=0;i<position.length;i++)
        {
            if(position[i]%2==0)
            {
                even+=1;
            }
            else
            {
                odd+=1;
            }
            count=Math.min(even,odd);
        }
        return count;
    }
}