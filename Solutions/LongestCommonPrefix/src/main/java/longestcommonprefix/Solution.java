package longestcommonprefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (;;) {
            for (int i = 1; i < strs.length; ++i) {
                try {
                    if (strs[i].charAt(index) != strs[i - 1].charAt(index)) return result.toString();
                } catch (IndexOutOfBoundsException e) {
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(index));
            ++index;
        }
    }

    public String longestCommonPrefixOptimized(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) return "";
            }
        }
        return prefix;
    }
}
