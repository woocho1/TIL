package week02.implementstr;

class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length()==0) { return 0; }
        if(!haystack.contains(needle)) { return -1; }

        System.out.println(haystack.indexOf(needle));
        return haystack.indexOf(needle);
    }
}

public class ImplementStr {

    public static void main(String[] args) {
        Solution so = new Solution();

//        String haystack = "hello";
//        String needle = "ll";

//        String haystack = "aaaaa";
//        String needle = "";

        String haystack = "mississippi";
        String needle = "issip";


        so.strStr(haystack, needle);
    }

}
