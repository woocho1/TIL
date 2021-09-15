package week01.twosum;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    answer=new int[]{i,j};
                }
            }
        }
        //System.out.print("answer: "+ Arrays.toString(answer));
        return answer;
    }

}

public class TwoSum {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        s.twoSum(nums, target);
    }

}
