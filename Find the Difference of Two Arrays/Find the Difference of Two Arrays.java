class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2 =new HashSet<>();
        HashSet<Integer> s3 =new HashSet<>();
        HashSet<Integer> s4 =new HashSet<>();
        HashMap<Integer,Integer> mp1=new HashMap<>();
        HashMap<Integer,Integer> mp2=new HashMap<>();
        
        
        for(int i=0;i<nums1.length;i++)
        {
             s1.add(nums1[i]);
        }
        
        
        
        for(int i=0;i<nums2.length;i++)
        {
            s2.add(nums2[i]);
            
        }
         for(int i=0;i<nums1.length;i++)
        {
            if(!s2.contains(nums1[i]))
                 s3.add(nums1[i]);
        }
     //   System.out.println("This is list 1"+s3);
        for(int i=0;i<nums2.length;i++)
        {
            if(!s1.contains(nums2[i]))
                 s4.add(nums2[i]);
        }
       
        l1.addAll(s3);
        l2.addAll(s4);
        
        
        return Arrays.asList(l1,l2);
        
      
    }
}