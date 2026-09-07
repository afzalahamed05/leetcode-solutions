class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        for(int i=0;i<=a;i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}