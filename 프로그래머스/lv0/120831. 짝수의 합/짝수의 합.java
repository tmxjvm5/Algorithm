class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i =0; i<= n; i++){
            if(i%2 == 0){
                sum+=i;
                answer = sum;
            }
        }
        return answer;
    }
}