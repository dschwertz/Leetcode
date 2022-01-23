package validparentheses;

public class Solution {
    public boolean isValid(String s) {
        StringBuilder open = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case '(' -> open.append('(');
                case '[' -> open.append('[');
                case '{' -> open.append('{');
                case ')' -> {
                    if (open.length() == 0 || open.charAt(open.length() - 1) != '(') return false;
                    open.deleteCharAt(open.length() - 1);
                }
                case ']' -> {
                    if (open.length() == 0 || open.charAt(open.length() - 1) != '[') return false;
                    open.deleteCharAt(open.length() - 1);
                }
                case '}' -> {
                    if (open.length() == 0 || open.charAt(open.length() - 1) != '{') return false;
                    open.deleteCharAt(open.length() - 1);
                }
            }
        }
        return (open.length() == 0);
    }
}
