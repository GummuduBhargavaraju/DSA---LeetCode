class Solution {
    public String restoreString(String s, int[] indices) {
        if( s == null || s.length() == 0)
        {
            return "";
        }
        if(s.length() != indices.length)
        {
            return "";
        }
        char chars [] = new char[s.length()];
        for(int i = 0 ; i <indices.length ; i++)
        {
            int pos = indices[i];
            chars[pos] = s.charAt(i);
        }
        String result = "";
        for(int i=0;i< chars.length; i++)
        {
            result += chars[i];
        }
        return result;        
    }
    
}