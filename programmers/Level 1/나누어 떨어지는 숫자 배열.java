import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer = append(answer, arr[i]);
            }
        }
        if (answer.length == 0) {
            answer = append(answer, -1);
        }
        Arrays.sort(answer);
        
        return answer;
    }
    
    public int[] append(int[] arr, int element) {
        int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        
        return arr;
    }
}