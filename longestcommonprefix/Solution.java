package longestcommonprefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];

            if(str.isEmpty()){
                return "";
            }

            if(sb.length() > str.length()){
                sb.delete(str.length(), sb.length());
            }

            for (int j = 0; j < str.length(); j++) {
                if (j >= sb.length()) {
                    break;
                }

                if (sb.charAt(j) != str.charAt(j)) {
                    sb.delete(j, sb.length());
                    break;
                }
            }

            if (sb.isEmpty()) {
                break;
            }
        }

        return sb.toString();


    }
}
