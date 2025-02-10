import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] answer = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(answer,(o , j) -> (j + o ).compareTo(o + j));
        
        if(answer[0].equals("0")){
            return "0";
        }

        return String.join("",answer);
    }
}