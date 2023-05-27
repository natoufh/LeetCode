public class problem28 {

    public static int strStr(String haystack, String needle) {

        Boolean initialCheck = haystack.contains(needle);
        int results = 0;

        if (initialCheck == true) {
            results = haystack.indexOf(needle);
            return results;

        } else {
            results = -1;
            return results;
        }

    }

    public static void main(String[] args) {

        strStr("sadbutsad", "sad");
        strStr("leetcode", "leeto");
    }
}
