class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                if(!st.isEmpty())
                {
                st.pop();
                }
                else
                {
                count++;
                }
            }
            
        }
        return count+st.size();
    }
}