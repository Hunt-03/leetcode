import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int longest = 0, i = 0, j = 0;
        
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                longest = Math.max(longest, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return longest;
    }
}
