class Solution {
    public int alternateDigitSum(int n) {

        String num = n + "";
        int sum = Integer.parseInt(num.charAt(0) + "");
        for(int i = 1 ; i<num.length();i++)
        {
            if(i%2 == 1)
            {
                sum -= Integer.parseInt(num.charAt(i) + "");
            }
            else
            {
                sum += Integer.parseInt(num.charAt(i) + "");
            }
        }
        return sum;


    }

}