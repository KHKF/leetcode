package easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {
        int index = 0;
        if (strings.length < 1) {
            return "";
        }
        while (true) {
            char element = strings[0].charAt(index);
            for (String string : strings) {
                if (string.length() <= index)
                    return string.substring(0, index);
                if (string.charAt(index) != element) {
                    return string.substring(0, index);
                }
            }
            index++;
        }
    }
}
