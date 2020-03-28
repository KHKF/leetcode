package easy;

public class StrstrImpl {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int lastHaystackIndex = haystack.length() - needle.length();
        for (int haystackIndex = 0; haystackIndex <= lastHaystackIndex; haystackIndex++) {
            for (int needleIndex = 0; needleIndex < needle.length(); needleIndex++) {
                if (haystack.charAt(haystackIndex + needleIndex) != needle.charAt(needleIndex)) {
                    break;
                } else if (needleIndex == needle.length() - 1) {
                    return haystackIndex + needleIndex;
                }
            }
        }
        return -1;
    }
}
