class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9)
        {
            return "";
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<num;i++)
        {
            int digit=Math.min(sum,9);
            ans.append(digit);
            int diff=sum-digit;
            sum=diff;
        }
        return ans.toString();
    }
}