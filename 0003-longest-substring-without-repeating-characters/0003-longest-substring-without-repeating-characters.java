class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlen=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.get(ch)>1)
            {
               char remove=s.charAt(left);
               hm.put(remove,hm.get(remove)-1);
               if(hm.get(remove)==0)
               {
                hm.remove(remove);
               }
               left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }

      return maxlen;  
    }
}