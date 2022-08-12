class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuilder sb = new StringBuilder();
        
        sb.append(S.charAt(0));
        
        int n = S.length();
        
        for(int i=1;i<n;i++)
        {
            if(S.charAt(i)!=S.charAt(i-1))
            {
                sb.append(S.charAt(i));
            }
        }
        
        return sb.toString();
    }
