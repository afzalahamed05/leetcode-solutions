class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int a=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<a+1;i++)
        {
            if(!set.contains(i))
            {
                l.add(i);
            }
        }
        return l;
    }
}