public class LongestPalidromicSubstring { public String longestPalindrome(String s) {
    if (s == null || s.isEmpty()) return "";

    String modifiedString = preProcess(s);
    int len = modifiedString.length();
    int[] palindromeLengths = new int[len];
    int center = 0, rightBoundary = 0;
    int maxLen = 0, maxLenCenter = 0;

    for (int i = 0; i < len; i++) {
        int mirror = 2 * center - i;

        if (i < rightBoundary) {
            palindromeLengths[i] = Math.min(rightBoundary - i, palindromeLengths[mirror]);
        }

        int a = i + (1 + palindromeLengths[i]);
        int b = i - (1 + palindromeLengths[i]);

        while (a < len && b >= 0 && modifiedString.charAt(a) == modifiedString.charAt(b)) {
            palindromeLengths[i]++;
            a++;
            b--;
        }

        if (i + palindromeLengths[i] > rightBoundary) {
            center = i;
            rightBoundary = i + palindromeLengths[i];
        }

        if (palindromeLengths[i] > maxLen) {
            maxLen = palindromeLengths[i];
            maxLenCenter = i;
        }
    }

    int start = (maxLenCenter - maxLen) / 2;
    return s.substring(start, start + maxLen);
}

    private String preProcess(String s) {
        StringBuilder modifiedString = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            modifiedString.append(c).append("#");
        }
        return modifiedString.toString();
    }
}