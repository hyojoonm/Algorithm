import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        
        int count = Arrays.stream(nums).distinct().toArray().length;
        
        if(count > nums.length/2){
            return nums.length/2;
        }
        
        return count;
    }
}