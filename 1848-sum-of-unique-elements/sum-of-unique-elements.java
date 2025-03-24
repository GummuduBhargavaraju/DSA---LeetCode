class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer , Integer > map = new HashMap<Integer , Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        int sum = 0;
        for(Map.Entry<Integer , Integer > entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                sum += entry.getKey();
            }
           
           
        }
        return sum;
    }
}