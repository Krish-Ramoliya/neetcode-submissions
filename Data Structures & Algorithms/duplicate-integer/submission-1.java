class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;

        for(i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],(map.get(nums[i]))+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> mp : map.entrySet())
        {
            if(mp.getValue()>1)
            {
                return true;
            }
        }

        return false;
       
 
    }
}
