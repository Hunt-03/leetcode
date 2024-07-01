class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
System.gc();
        return maxArea;

        
    }
}
// import java.util.*;
// class Solution {
//     public int maxArea(int[] height) {
//         int n = height.length;
//         int start =0;
//         int end = height.length-1;
//         int maxarea = Integer.MIN_VALUE;
//         while (start < end) {
//             if(height[start]<height[end]){
//                 maxarea = Math.max(maxarea,height[start]*(end-start));
//                 start ++;
//             }
//             else {
//                 maxarea = Math.max(maxarea,height[end]*(end-start));
//                 end--;

//             }
//     }
//     return maxarea;
// }
// }