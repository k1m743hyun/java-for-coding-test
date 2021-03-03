import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                temp.add(numbers[i] + numbers[j]);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int k = 0; k < temp.size(); k++) {
            if (!ans.contains(temp.get(k))) {
                ans.add(temp.get(k));
            }
        }
        int[] answer =  new int[ans.size()];
        int size = 0;
        for(int item : ans) {
            answer[size++] = item;
        }
        Arrays.sort(answer);
        return answer;
    }
}