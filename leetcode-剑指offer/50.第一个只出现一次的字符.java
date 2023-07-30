class Solution {
    public char firstUniqChar(String s) {
        int[] myhash = new int[27];
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            myhash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; ++i) {
            if (1 == myhash[s.charAt(i) - 'a']) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}