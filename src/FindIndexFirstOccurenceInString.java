public class FindIndexFirstOccurenceInString {
    public int strStr(String haystack, String needle) {
        StringBuilder sb = new StringBuilder(haystack);
        int index = sb.indexOf(needle);
        if (index < 0 || index > sb.capacity() - 1) {
            return -1;
        } else {
            return index;
        }
    }
}