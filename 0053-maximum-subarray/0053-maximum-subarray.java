class Solution {
    public int maxSubArray(int[] a) {
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
             cur= cur+a[i];
             if(cur>max)
             max=cur;
             if(cur<0)
             cur=0;
        }
     return max;
    }
}
// -1 0 3 4 -1 -7  cur=-1, max=-128;
// i=0; cur=-1, max=-1;
// i=1; cur=-1 max=-1;
//i=2; cur=3, max=3;
//i=3; cur=7, max=7
//i=4; cur= 6, max=7;
//i=5; cur =-1, max=7;


