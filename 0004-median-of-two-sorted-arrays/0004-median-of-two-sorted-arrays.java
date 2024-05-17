public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n=nums1.length;
      int m=nums2.length;
      int[] res=new int[n+m];
      int siz2=n+m;
      int siz=(n>m)?n:m;
      for(int i=0;i<n;i++)
        res[i]=nums1[i];
    for(int i=0;i<m;i++)
        res[n+i]=nums2[i];
      Arrays.sort(res);
      double mass;
      int mid=(n+m)/2;
      if((n+m)%2==0){
        mass= (double)((res[mid]+res[mid-1]))/2;
        return mass;
      }
      else
      return (double)res[mid];
      }
}
