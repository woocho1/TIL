package week01.reverseinteger;

class Solution {
    public int reverse(int x) {
        //음수!!
        int answer = 0;
        int signed = 1;  //부호
        try{
            //음수양수 판별
            if(x<0){
                signed = -1;
                x=Math.abs(x);
            }
            String str_x = Integer.toString(x);
            StringBuffer sb = new StringBuffer(str_x);
            String reverse_x = sb.reverse().toString();
            //System.out.println(reverse_x);
            answer = Integer.parseInt(reverse_x);
        } catch (NumberFormatException e){
            //e.printStackTrace();
        } finally {
            answer = answer * signed;
            //System.out.println(answer);
            return answer;
        }

    }
}

public class ReverseInteger {

    public static void main(String[] args) {
        Solution s = new Solution();
        //s.reverse(2147483009);
        //s.reverse2(2147483009);
        //s.reverse2(-21474);
    }

}
