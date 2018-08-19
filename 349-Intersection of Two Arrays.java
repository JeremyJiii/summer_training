class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        List<Integer> ls = new ArrayList();
        for(int n:nums1.length>nums2.length?nums1:nums2){
            set.add(n);
        }
        for(int n:nums1.length>nums2.length?nums2:nums1){
            if(set.contains(n)){
                ls.add(n);
                set.remove(n);
            }
        }
        int[] res = new int[ls.size()];
        int t=0;
        for(int n:ls)
            res[t++] = n;
        return res;
    }
}
