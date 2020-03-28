package easy;

public class LastWordLenth {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1.length > 0 ? s1[s1.length - 1].length() : 0;
    }
}
