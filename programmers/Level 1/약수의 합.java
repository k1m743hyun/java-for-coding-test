import java.util.ArrayList;
import java.lang.Math;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 1; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                if(!arrList.contains(i)) {
                    arrList.add(i);
                }
                if(!arrList.contains(n / i)) {
                    arrList.add(n / i);
                }
            }
        }
        
        int answer = 0;
        for(int value : arrList) {
            answer += value;
        }
        
        return answer;
    }
}