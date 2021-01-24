class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] count = new int[n];
        
        for (int i : lost) {
            count[i - 1]--;
        }
        
        for (int i : reserve) {
            count[i - 1]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] < 0) {
                if (i != 0 && count[i - 1] > 0) {
                    count[i - 1]--;
                    count[i]++;
                }
                
                else if (i != count.length - 1 && count[i + 1] > 0) {
                    count[i]++;
                    count[i + 1]--;
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 0) {
                answer++;
            }
        }
        
        return answer;
    }
}