package week02.validanagram;

import java.util.Arrays;

class Solution {

    public boolean isAnagram(String s, String t) {

        /* 정규식 */

        /* 정규식으로는 철자개수까지 판별하기 어려움
        int length = s.length();
        String reg = "[" + s + "]";
        String new_reg = "";

        for (int i=0; i<length; i++) {
            new_reg += reg;
        }

        if(s.matches(new_reg)) { return true; }
        */

        /* Comparable<T> interface */


        /* 글자 재정렬 */
        //use Stream API
        final String[] new_s = {""};
        Arrays.stream(s.split("")).sorted()
                .forEach( c -> new_s[0] += c );

        final String[] new_t = {""};
        Arrays.stream(s.split("")).sorted()
                .forEach( c -> new_t[0] += c );

        if(new_s[0].equals(new_t[0])) {
            return true;
        }
        return false;

    }

}

public class ValidAnagram {

    public static void main(String[] args) {

        Solution so = new Solution();
        String s = "anagram";
        String t = "nagaram";

        so.isAnagram(s, t);

    }
}
