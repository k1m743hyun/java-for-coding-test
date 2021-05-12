class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        else {
            int min  = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    min = arr[0];
                }
            
                if (arr[i] < min){
                    min = arr[i];
                }
            }
            int idx = 0;
            int[] answer = new int[arr.length - 1];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > min) {
                    answer[idx++] = arr[j];
                }
            }
        
            return answer;
        }
    }
}