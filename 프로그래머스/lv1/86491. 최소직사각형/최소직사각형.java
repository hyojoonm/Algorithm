class Solution {
    public int solution(int[][] sizes) {
        int max1 = 0;
        int min1 = 0;
        
        for(int i = 0; i < sizes.length;i++){
            int[] size = sizes[i];
            
            int max2 = Math.max(size[0],size[1]);
            int min2 = Math.min(size[0],size[1]);
            
            max1 = Math.max(max1,max2);
            min1 = Math.max(min1,min2);
        }
        
        
        return max1 * min1;
    }
}