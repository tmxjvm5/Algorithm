class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i <= my_string.length()-1; i++) {
            for(int j = 0; j <= n-1; j++) {
                answer += my_string.charAt(i);
            }
        }
            return answer;
    }
}