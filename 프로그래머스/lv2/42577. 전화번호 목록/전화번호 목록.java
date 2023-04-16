import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String,Integer> hm = new HashMap<>();
        for(int i = 0; i < phone_book.length;i++){
            hm.put(phone_book[i],i);
        }
        for(String phone : phone_book){
            
            for(int i = 1 ; i<phone.length();i++){
                
                if(hm.containsKey(phone.substring(0,i)))
                    answer = false;
            }
        }
        return answer;
    }
}