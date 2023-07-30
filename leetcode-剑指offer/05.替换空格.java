class Solution {
    public String replaceSpace(String s) {

        //使用StringBuilder
        StringBuilder res = new StringBuilder();

        int len = s.length();
        for (int i = 0; i < len; ++i) {
            if (' ' == s.charAt(i)) {
                res.append("%20");
            } else {
                res.append(s.charAt(i));
            }
        }

        //记得转换为String
        return res.toString();
    }
}