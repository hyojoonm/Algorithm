class Solution {
    public int solution(int n, int k) {
        
        int sum = 12000* n ;
        int sale = 0;
        while(n>=10)
        {
            sale += 2000;
            n = n -10;
        }
        int answer = sum + k*2000 - sale;
        return answer;
    }
}