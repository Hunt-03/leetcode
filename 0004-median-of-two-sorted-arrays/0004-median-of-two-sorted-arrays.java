public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n=nums1.length;
      int m=nums2.length;
      int[] res=new int[n+m];
      int siz2=n+m;
      int siz=(n>m)?n:m;
      int i=0;
      while(i<siz){
        if(i<n && n!=0)
        res[i]=nums1[i];
        if(i<m&& m!=0){
        res[n+i]=nums2[i];
        }
        i++;
        }

      
    // for(int i=0;i<m;i++)
    //     res[n+i]=nums2[i];
      Arrays.sort(res);
      int mid=(n+m)/2;
      if((siz2&1)==0){
        return (double)((res[mid]+res[mid-1]))/2;
      }
      else
      return (double)res[mid];
      }
}
