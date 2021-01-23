class Solution {
    public int solution(String name) {
        int len = name.length();
        int min_dist = len - 1;
        int answer = 0;
        
        for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            
            min_dist = Math.min(min_dist, (2 * i) + (len - next));
        }
        
        answer += min_dist;
        
        return answer;
    }
}