class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            st.push(ch);
            else if(ch==')'||ch==']'||ch=='}')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top = st.peek();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }

                st.pop();
            }
        }
        return st.isEmpty();
    }
}