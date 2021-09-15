package week02.palindrome;

class Solution {

    int reverseNum(int num) {
        String str = "";
        while (num>0) {
            str += Integer.toString(num%10);
            num /= 10;
        }
        try {
            num = Integer.parseInt(str);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        return num;
    }

    public boolean isPalindrome(int x) {

        if(x<0){ return false; }
        if(reverseNum(x)==x) {
            return true;
        }
        return false;
    }
}

public class Palindrome {
    public static void main(String[] args) {

        Solution so = new Solution();
        //so.reverseNum(123134524);
        System.out.println(so.isPalindrome(121));
    }
}
