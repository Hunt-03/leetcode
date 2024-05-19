class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        String[] mapChar = new String[26];
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            if (mapChar[c - 'a'] == null) {
                mapChar[c - 'a'] = words[i];
            } else if (!mapChar[c - 'a'].equals(words[i])) {
                return false;
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]) && pattern.charAt(i) != pattern.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}