class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        service = n / 10 * 2000;
        answer = (12000 * n) + (2000 * k) - service;
        
        
        return answer;
    }
}